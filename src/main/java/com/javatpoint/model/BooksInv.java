package com.javatpoint.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@Data
public class BooksInv {


    @Id
    @Column(name="book_id")
    String bookId;


    @Column(name="book_name")
    String bookName;





}
