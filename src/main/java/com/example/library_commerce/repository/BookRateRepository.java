package com.example.library_commerce.repository;

import com.example.library_commerce.model.entity.BookRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRateRepository extends JpaRepository<BookRate, Long> {
}
