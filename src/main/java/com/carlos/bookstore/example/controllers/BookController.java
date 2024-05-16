package com.carlos.bookstore.example.controllers;


import com.carlos.bookstore.example.models.Book;
import com.carlos.bookstore.example.services.BookServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {
    @Autowired
    private final BookServiceImpl bookService;
BookController(BookServiceImpl bookService){
    this.bookService = bookService;
}
//    @Operation(summary = "Retrieves all book instances from database", description = "No conditions")
//    @GetMapping("/books")
//    public List<Book> all(){
//    return bookService.listEntity();
//}
    @GetMapping("/books")
    public Page<Book> all(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int limit){
        return bookService.listEntityPaginated(page, limit);
    }
    @Operation(summary = "Retrieves an instance of a book and modifies its info")
    @PutMapping("/books/{id}")
    public ResponseEntity<String> editBook(@PathVariable Long id, @RequestBody Book editedBook){
    bookService.editEntity(id, editedBook);
    return ResponseEntity.ok("Book modified");
    }

    @Operation(summary = "Creates a book instance onto database", description = "Needs to fulfill book model properties")
    @PostMapping("/books")
    public ResponseEntity<String> createBook(@RequestBody Book newBook){
    bookService.createEntity(newBook);
    return ResponseEntity.ok().build();
    }

    @Operation(summary = "Retrieves a book instance from database", description = "Book instance has to exist")
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id){
    return bookService.getEntity(id);
}
    @Operation(summary = "Deletes a book instance from database", description = "Book instance has to exist")
    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> createBook(@PathVariable Long id){
    bookService.deleteEntity(id);
    return ResponseEntity.ok().build();
}

}
