package com.javatpoint;


public class Constants {

    public static final String QUANTITY_MORE_THAN_ONE ="book can be issued as its quantity is  ::";
    public static final String QUANTITY_MORE_THAN_TWO ="book can be issued as its quantity is  ::";
    public static final String QUANTITY_LESS_THAN_ONE ="book cant be issued as its less than 1 quantity";
    public static final String QUANTITY_LESS_THAN_ONE ="book cant be issued as its less than 1 quantity";
    public static final String getJoinResult ="SELECT inv_count.bookid as book_id, books.bookname as book_name\n" +
            "        FROM inv_count\n" +
            "        INNER JOIN books ON books.bookid = inv_count.bookid where books.bookname = :bName\n" +
            "        ";

    String rebaseDemo;

    String rebaseDemo2;

    String getRebaseDemo2;

    String getRebaseDemo;


}
