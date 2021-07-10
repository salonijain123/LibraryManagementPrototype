package com.javatpoint;

import com.javatpoint.Books;
import com.javatpoint.BooksService;
import com.javatpoint.InvCount;
import com.javatpoint.InvCountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//mark class as Controller

@RestController


public class BooksController  {
	
	
	
	
	@SALONI JAIN

    @Autowired
    BooksService booksService;


    @Autowired
    InvCountRepo invCountRepo;

	String addToController
		
		String checking
		string checking
		
		



    @RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")

    private Books getBooks(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }



    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

	  // insert into inventory table

	  @PostMapping(name = "/invCount") private int saveInvCount(@RequestBody InvCount
	  invCount) { invCountRepo.save(invCount);

          System.out.println("new commit");

          return invCount.getBookid();


      }

	  // spring - cloud config

 //   @Value("${username}")
    private String username="user";
    private String new_addition="user";

    private String field1;



    //  @Value("${password}")
    private String password="pass";

    @GetMapping("/message")
    String getMessage() {
        return this.username  + this.password;
    }


    // check count

	 /* @GetMapping(name = "/checkCount/{book_id}", produces =
	  {MediaType.APPLICATION_JSON_VALUE})

	  private String checkCount(@PathVariable("book_id") int id) {
	  Optional<InvCount> invCount = invCountRepo.findById(id); InvCount
	  invCountObject = invCount.get(); if (invCountObject.getCount() >= 1) { return
	  Constants.QUANTITY_MORE_THAN_ONE + invCountObject.getCount(); } else { return
	  Constants.QUANTITY_LESS_THAN_ONE; }

	  }*/


	  // using Native query with Entity Manager to fetch result of a join SQL query
    //   comment

   /* @RequestMapping(name="/usingEm/",
            method=RequestMethod.GET,
            produces={MediaType.APPLICATION_JSON_VALUE})

    public List<BooksInv> getBooksFromJoinResult() {
        return  booksService.getByEm();


    }*/

    @RequestMapping(name="/getString/",
            method=RequestMethod.GET,
            produces={MediaType.APPLICATION_JSON_VALUE})

    public String getString() {
        return "I am working fine";


    }
	
	@testing1
	#Testing2

}
