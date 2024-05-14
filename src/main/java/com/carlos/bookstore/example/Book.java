package com.carlos.bookstore.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "books")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Book {
    @NotBlank
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    @NotBlank
    @Size(min = 0, max = 50)
    @Column(name="name")
    private String name;
    @NotBlank
    @Size(min = 0, max = 30)
    @Column(name="author")
    private String author;
    @NotBlank
    @Column(name="release_year")
    private int release_year;
}
