package com.example.library_commerce.controller;

import com.example.library_commerce.model.dto.AuthorDTO;
import com.example.library_commerce.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;


    @PostMapping
    public String create(@RequestBody AuthorDTO authorDTO){
//        if (authorService == null) {
//            return "Error";
//        }
        this.authorService.createAuthor(authorDTO);
        return "Created";
    }
}
