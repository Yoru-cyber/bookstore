package com.carlos.bookstore.example.controllers;


import com.carlos.bookstore.example.Book;
import com.carlos.bookstore.example.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookController {
    @Autowired
    private final BookServiceImpl bookService;
BookController(BookServiceImpl bookService){
    this.bookService = bookService;
}
    @GetMapping("/books")
    public List<Book> all(){
    return bookService.listEntity();
}
    @GetMapping("/books/test")
    public String test(){
    return "test";
    }
    @PostMapping("/books")
    public ResponseEntity<String> createBook(@RequestBody Book newBook){
    bookService.createEntity(newBook);
    return ResponseEntity.ok().build();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id){
    return bookService.getEntity(id);
}
    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> createBook(@PathVariable Long id){
    bookService.deleteEntity(id);
    return ResponseEntity.ok().build();
}

}
