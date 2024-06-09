package com.example.library_commerce.controller;

import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.service.BookService;

public class BookController {
    private BookService bookService;
    public String create(BookDTO bookDTO, Author author){
        this.bookService.createBook(bookDTO, author);
        return "created";
    }
}
