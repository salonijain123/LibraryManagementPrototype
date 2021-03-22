package com.javatpoint.controller;

import com.javatpoint.model.Books;
import com.javatpoint.model.Constants;
import com.javatpoint.model.InvCount;
import com.javatpoint.repository.InvCountRepo;
import com.javatpoint.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.*;


import java.util.Optional;

//mark class as Controller
@RestController
public class BooksController  {

    @Autowired
    BooksService booksService;


    @Autowired
    InvCountRepo invCountRepo;

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

	  // insert into inventory table

	  @PostMapping("/invCount") private int saveInvCount(@RequestBody InvCount
	  invCount) { invCountRepo.save(invCount); return invCount.getBookid();

	  }

    @Value("${username}")
    private String username;


    @Value("${password}")
    private String password;

    @GetMapping("/message")
    String getMessage() {
        return this.username  + this.password;
    }


    // check count

	  @GetMapping(value = "/checkCount/{book_id}", produces =
	  {MediaType.APPLICATION_JSON_VALUE})

	  private String checkCount(@PathVariable("book_id") int id) {
	  Optional<InvCount> invCount = invCountRepo.findById(id); InvCount
	  invCountObject = invCount.get(); if (invCountObject.getCount() >= 1) { return
	  Constants.QUANTITY_MORE_THAN_ONE + invCountObject.getCount(); } else { return
	  Constants.QUANTITY_LESS_THAN_ONE; }

	  }


}
