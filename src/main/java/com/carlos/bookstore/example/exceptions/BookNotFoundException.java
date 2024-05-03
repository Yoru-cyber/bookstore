package com.carlos.bookstore.example.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long bookID){
        super("Could not find book" + bookID);
    }
}
