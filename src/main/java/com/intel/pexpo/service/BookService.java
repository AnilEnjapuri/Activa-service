package com.intel.pexpo.service;

import com.intel.pexpo.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book save(Book book);

    List<Book> bookList();

   Book getBookById(Long bookId);

    Book updateBook(Book book);
}
