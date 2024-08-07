package com.example.library_commerce.controller;

import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return  bookService.getAllBooks() != null ?
                ResponseEntity.ok().body(bookService.getAllBooks()) :
                ResponseEntity.badRequest().build();
    }

    @GetMapping("genre/{genre}")
    public ResponseEntity<Optional<List<Book>>> getByGenre(@PathVariable String genre){
        if(bookService.getGenre(genre).isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        var booksByGenre = bookService.getGenre(genre);
        return ResponseEntity.ok().body(booksByGenre);
    }

    @GetMapping("release/{date}")
    public ResponseEntity<List<Book>> getByReleaseDate(@PathVariable Date releaseDate) {
        var booksByDate = bookService.getByDate(releaseDate);
        if(booksByDate.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return ResponseEntity.ok().body(booksByDate);
    }

    @PutMapping
    public ResponseEntity<Book> editBook(@PathVariable Long id, @RequestBody BookDTO bookDTO) {
        var book = bookService.getById(id);
        if (book.isEmpty()) return (ResponseEntity<Book>) ResponseEntity.status(HttpStatus.NOT_FOUND);

        return (ResponseEntity<Book>) ResponseEntity.status(HttpStatus.OK);
    }
}
