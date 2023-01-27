package com.intel.pexpo.service;

import com.intel.pexpo.entity.Book;
import com.intel.pexpo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bookService")
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;
    @Override
    public Book save(Book book) {
      return   bookRepository.save(book);

    }

    @Override
    public List<Book> bookList() {
         return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public Book updateBook(Book book) {
        book.setAuthor(book.getAuthor());
        return bookRepository.save(book);
    }
}
