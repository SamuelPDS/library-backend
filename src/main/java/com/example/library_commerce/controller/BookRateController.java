package com.example.library_commerce.controller;

import com.example.library_commerce.model.dto.BookRateDTO;
import com.example.library_commerce.model.entity.BookRate;
import com.example.library_commerce.service.BookRateService;
import com.example.library_commerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rate")
public class BookRateController {
    @Autowired
    private BookRateService service;

    @PostMapping("{book_id}")
    public ResponseEntity<BookRate> sendBookAvaliation(@PathVariable Long book_id, @RequestBody BookRateDTO bookRate){
        service.saveBookRate(book_id, bookRate);
        return ResponseEntity.ok().build();
    }
}
