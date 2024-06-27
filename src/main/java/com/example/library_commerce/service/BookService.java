package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.AuthorDTO;
import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Author;
import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.repository.AuthorRepository;
import com.example.library_commerce.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
private BookRepository repository;

    public void createBook(BookDTO bookDTO){
        var book = new Book(bookDTO);
        this.repository.save(book);
    }

//    public List<Book> getAuthor(String author){
//        return this.repository.findByAuthor(author);
//    }

    public Optional<List<Book>> getGenre(String genre) {
        return this.repository.findByGenre(genre);
    }

    public List<Book> getByDate(Date releaseDate){
        return repository.findByReleaseDate(releaseDate);
    }

    public List<Book> getAllBooks(){
        return repository.findAll();
    }
}
