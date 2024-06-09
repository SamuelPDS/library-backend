package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.AuthorDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.repository.AuthorRepository;

public class AuthorService {
    private AuthorRepository authorRepository;

    public void createAuthor(AuthorDTO authorDTO) {
        var author = new Author(authorDTO);
        this.authorRepository.save(author);
        System.out.println("Created");
    }
}
