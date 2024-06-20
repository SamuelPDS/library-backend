package com.example.library_commerce.model.entity;

import com.example.library_commerce.model.dto.AuthorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Date bornData;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
//    private List<Book> books = new ArrayList<>();

    public Author(AuthorDTO authorDTO) {
//        this.name = authorDTO.getName();
//        this.bornData = authorDTO.getBornData();
    }

//    public Author(Author author) {
//        this.name = author.getName();
//        this.bornData = author.getBornData();
//    }
}
