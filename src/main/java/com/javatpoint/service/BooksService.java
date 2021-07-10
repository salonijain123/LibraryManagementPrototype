package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;

import com.javatpoint.model.BooksInv;
import com.javatpoint.model.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

//defining the business logic
@Service
public class BooksService 
{
@Autowired
BooksRepository booksRepository;

String field2;

    @Autowired
    EntityManager em;
//getting all books record by using the method findaAll() of CrudRepository
public List<Books> getAllBooks() 
{
List<Books> books = new ArrayList<Books>();
booksRepository.findAll().forEach(books1 -> books.add(books1));
return books;
}
//getting a specific record by using the method findById() of CrudRepository
public Books getBooksById(int id) 
{
return booksRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Books books) 
{
booksRepository.save(books);
}


public List<BooksInv> getByEm(){

    TypedQuery<BooksInv> query = (TypedQuery<BooksInv>) em.createNativeQuery(Constants.getJoinResult, BooksInv.class);
    List<BooksInv> results = query.setParameter("bName","Harry Potter").getResultList();
    return results;

    String a;
    String b;


    String c;
}
}