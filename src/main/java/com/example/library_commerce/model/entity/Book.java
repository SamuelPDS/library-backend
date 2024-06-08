package com.example.library_commerce.model.entity;

import com.example.library_commerce.model.dto.BookDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String genre;
    @Column
    private String price;
    @ManyToOne
    @JoinColumn(name = "author", referencedColumnName = "name")
    private Author author;
    @Column
    private Date release_date;

    public Book(BookDTO bookDTO, Author author) {
        this.genre = bookDTO.getGenre();
        this.price = bookDTO.getPrice();
        this.author = author;
    }
}

