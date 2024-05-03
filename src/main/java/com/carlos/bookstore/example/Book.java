package com.carlos.bookstore.example;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Book {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    @Column(name="name")
    private String name;
    @Column(name="author")
    private String author;
    @Column(name="release_year")
    private int release_year;
}
