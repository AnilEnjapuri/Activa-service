package com.intel.pexpo.repository;

import com.intel.pexpo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book, Integer> {
}
