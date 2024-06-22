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

    @Column(length = 100)
    private String title;

    @Column(length = 64)
    private String genre;

    @Column(length = 12)
    private double price;
//    @ManyToOne
//    @JoinColumn(name = "author_id", referencedColumnName = "id")
//    private Author author;
    private String authorName;
    @Column
    private Date releaseDate;

    public Book(BookDTO bookDTO) {
        this.title = bookDTO.getTitle();
        this.genre = bookDTO.getGenre();
        this.price = bookDTO.getPrice();
        this.releaseDate = bookDTO.getReleaseDate();
        this.authorName = bookDTO.getAuthorName();
//        this.author = author; future implements
    }
}

