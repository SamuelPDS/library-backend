package com.example.library_commerce.model.dto;

import com.example.library_commerce.model.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {
    private String name;
    private Date bornData;

    public AuthorDTO(Author author){
    this.name = author.getName();
    this.bornData = author.getBornData();
    }
}