package com.intel.pexpo.service;

import com.intel.pexpo.entity.Book;
import com.intel.pexpo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("/bookService")
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;
    @Override
    public Book save(Book book) {
      return   bookRepository.save(book);

    }
}
