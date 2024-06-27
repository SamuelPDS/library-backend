package com.example.library_commerce.repository;

import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@ActiveProfiles("test")
class BookRepositoryTest {

    @Autowired
    EntityManager entityManager; //vem do JPA

    @Autowired
    private BookRepository bookRepository;

    @Test
    @DisplayName("Should get Books by Genre successfully")
    void findByGenreSuccess() {
        var dto = new BookDTO("teste", "fiction", 19.99,  new Date(), "Samuel Charles", "teste");
        this.createUser(dto);

      Optional<Book> foundedBooks = this.bookRepository.findOneByGenre("fiction");
        System.out.println(foundedBooks);
      assertThat(foundedBooks.isPresent()).isTrue();
    }
    private Book createUser(BookDTO dto){
        var newBook = new Book(dto);
        entityManager.persist(newBook);
        return newBook;
    }

    @Test
    @DisplayName("Should not return the books by genre")
    void findByGenreError(){

        Optional<Book> result = bookRepository.findOneByGenre("teste");
        System.out.println(result);
        assertThat(result.isEmpty()).isTrue();
    }
}