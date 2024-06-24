package com.example.library_commerce.model.entity;

import com.example.library_commerce.model.dto.BookRateDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class BookRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    @Column
    private String clientName;

    @Column(nullable = false)
    private Double rate;

    @Column
    private String comments;

    public BookRate(BookRateDTO dto, Book book) {
        this.book = book;
        this.clientName = dto.clientName();
        this.rate = dto.rate();
        this.comments = dto.comment();
    }
}
