package com.example.library_commerce.controller;

import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookDTO> create(@RequestBody BookDTO bookDTO){
         this.bookService.createBook(bookDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("author/{author}")
    public ResponseEntity<List<Book>> getByAuthor(@PathVariable String author) {
        System.out.println(author);
        if(bookService.getAuthor(author).isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        var bookByAuthos = bookService.getAuthor(author);
        return ResponseEntity.ok().body(bookByAuthos);
    }

    @GetMapping("genre/{genre}")
    public ResponseEntity<List<Book>> getByGenrer(@PathVariable String genre){
        if(bookService.getGenre(genre).isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        var booksByGenrer = bookService.getGenre(genre);
        return ResponseEntity.ok().body(booksByGenrer);
    }
}
