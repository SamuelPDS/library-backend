package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.AuthorDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {
    private AuthorRepository authorRepository;

    public Author createAuthor(AuthorDTO authorDTO) {
        System.out.println("Created");
        var author = new Author(authorDTO);
        return this.authorRepository.save(author);
    }
}
