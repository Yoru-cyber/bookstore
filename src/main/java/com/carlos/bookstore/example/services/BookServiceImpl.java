package com.carlos.bookstore.example.services;

import com.carlos.bookstore.example.Book;
import com.carlos.bookstore.example.exceptions.BookNotFoundException;
import com.carlos.bookstore.example.infrastructure.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements GenericService<Book> {
    @Autowired
    private final BookRepository bookRepository;
    BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public void createEntity(Book newBook){
        bookRepository.save(newBook);
    }
    @Override
    public Book getEntity(Long bookID) {
        return bookRepository.findById(bookID).orElseThrow(()-> new BookNotFoundException(bookID));
    }

    @Override
    public void editEntity(Long bookID, Book editedBook) {
        bookRepository.findById(bookID).map(book -> bookRepository.save(editedBook)).orElseThrow(()-> new BookNotFoundException(bookID));
    }

    @Override
    public void deleteEntity(Long bookID) {
    bookRepository.deleteById(bookID);
    }

    @Override
    public List<Book> listEntity() {
        return bookRepository.findAll();
    }
    public Page<Book> listEntityPaginated(int page, int limit){
        PageRequest pageRequest = PageRequest.of(page, limit);
        return bookRepository.findAll(pageRequest);
    }
}
