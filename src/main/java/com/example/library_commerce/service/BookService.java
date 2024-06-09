package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.AuthorDTO;
import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.repository.AuthorRepository;
import com.example.library_commerce.repository.BookRepository;

public class BookService {
private BookRepository repository;

    public void createBook(BookDTO bookDTO, Author authorName){
        var book = new Book(bookDTO, authorName);
        repository.save(book);
    }
}
