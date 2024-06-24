package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.BookRateDTO;
import com.example.library_commerce.model.entity.BookRate;
import com.example.library_commerce.repository.BookRateRepository;
import com.example.library_commerce.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookRateService {
    @Autowired
    private BookRateRepository repository;
    @Autowired
    private BookRepository bookRepository;
    public void saveBookRate(Long id, BookRateDTO bookRateDTO){
        var book = bookRepository.findById(id);
        if(book.isPresent()) {
            repository.save(new BookRate(bookRateDTO, book.get()));
        }
    }
}
