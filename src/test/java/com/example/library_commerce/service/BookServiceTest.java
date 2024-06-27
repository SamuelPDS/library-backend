package com.example.library_commerce.service;

import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Book;
import com.example.library_commerce.repository.BookRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.Optional;

@DataJpaTest
@ActiveProfiles("teste")
class BookServiceTest {

@Autowired
private BookRepository bookRepository;

@Autowired
private EntityManager entityManager;

    @Test
    @DisplayName("should create the book")
    void createBookSucess() {
        BookDTO bookDto = new BookDTO("teste", "fiction", 19.99,  new Date(), "Samuel Charles", "teste");
        var book = new Book(bookDto);
      Optional<Book> savedData = this.bookRepository.saveBooks(book);

        assertThat(savedData.isPresent()).isTrue();
    }

    private Book createUser(BookDTO dto){
        var newBook = new Book(dto);
        entityManager.persist(newBook);
        return newBook;
    }
}