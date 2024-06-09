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
	 	AuthorController authorController = null;

		var book1 = new BookDTO();
		var author1 = new Author();
		author1.setName("J. K. Rowling");
		book1.setTitle("Harry Potter and the Sorcerer's Stone");
		book1.setGenre("fantasy");
		book1.setAuthor(author1);
		book1.setPrice(76.99);

		authorController.create(author1);
	}
}
