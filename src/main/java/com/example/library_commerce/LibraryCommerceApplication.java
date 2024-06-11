package com.example.library_commerce;

import com.example.library_commerce.controller.AuthorController;
import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryCommerceApplication.class, args);

	}
}
