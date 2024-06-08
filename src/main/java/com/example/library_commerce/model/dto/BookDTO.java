package com.example.library_commerce.model.dto;

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
    private Long id;
    private String genre;
    private String price;
    private String author;
    private Date release_date;


    public BookDTO(Book book) {
        genre = book.getGenre();
        this.price = book.getPrice();
        this.author = book.getAuthor().getName();
        this.release_date = book.getRelease_date();
    }
}
