package com.carlos.bookstore.example.infrastructure;

import com.carlos.bookstore.example.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
