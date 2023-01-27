package com.intel.pexpo.repository;

import com.intel.pexpo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "SELECT * FROM book  WHERE book_Id = :bookId", nativeQuery = true)
    Optional<Book> findById(Long bookId);
}
