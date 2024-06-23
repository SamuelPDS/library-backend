package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Author;

import java.util.Date;

public record AuthorDTO(Long id, String name, Date bornData) {
    public AuthorDTO(Author author) {
        this(author.getId(), author.getName(), author.getBornData());
    }
}
