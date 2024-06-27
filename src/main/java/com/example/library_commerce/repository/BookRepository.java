package com.example.library_commerce.repository;

import com.example.library_commerce.model.dto.BookDTO;
import com.example.library_commerce.model.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {
//    List<Book> findByAuthor(String author);

    Optional<List<Book>> findByGenre(String genre);

    Optional<Book> findOneByGenre(String genre);

    List<Book> findByReleaseDate(Date releaseDate);

    Optional<Book> saveBooks(Book book);
}
