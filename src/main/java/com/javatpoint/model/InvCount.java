package com.javatpoint.model;



import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Data
@Entity(name="inv_count")
//defining class name as Table name
@Table

public class InvCount {
    //Defining book id as primary key
    @Id
    @Column
    private int bookid;
    @Column
    private String bookname;
    @Column
    private int count;

}