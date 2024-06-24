package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.model.entity.BookRate;
import jakarta.validation.constraints.NotNull;

public record BookRateDTO(String comment, @NotNull Double rate, String clientName) {

    public BookRateDTO(BookRate book){
        this(book.getComments(), book.getRate(), book.getClientName());
    }
}
