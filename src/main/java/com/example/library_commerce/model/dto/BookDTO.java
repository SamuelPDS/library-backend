package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class BookDTO {
    private String title;
    private String genre;
    private double price;
    private Date releaseDate;
//    private Author author;
    private String authorName;
    private String synopsis;

    public BookDTO(Book book) {
        this.title = book.getTitle();
        this.genre = book.getGenre();
        this.price = book.getPrice();
        this.releaseDate = book.getReleaseDate();
        this.authorName = book.getAuthorName();
//        this.author = book.getAuthor();
    }
}
