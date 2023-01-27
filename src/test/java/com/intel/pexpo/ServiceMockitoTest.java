package com.intel.pexpo;


import com.intel.pexpo.entity.Book;
import com.intel.pexpo.repository.BookRepository;
import com.intel.pexpo.service.BookService;
import com.intel.pexpo.service.BookServiceImpl;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {ServiceMockitoTest.class})
public class ServiceMockitoTest {

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookService bookService = new BookServiceImpl();

   // public List<Book> bookList;
    @Test
    @Order(1)
    public void testGetAllBooks(){
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(25L, "xyz"));
        bookList.add(new Book(26L, "pqr"));
        when(bookRepository.findAll()).thenReturn(bookList);
        assertEquals(2, bookService.bookList().size());
        //;
    }

    @Test
    @Order(2)
    public void getBookById(){
        Book book = new Book();
        System.out.println(book);
        long bookId = 1;
        when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        //assertEquals(bookId, bookService.getBookById(bookId));
    }

    @Test
    @Order(3)
    public void testAddBook(){
        Book book = new Book();
        when(bookRepository.save(book)).thenReturn(book);
        assertEquals(book, bookService.save(book));
    }

    @Test
    @Order(4)
    public void testUpdateBook(){
        Book book = new Book(22L, "mno");
        when(bookRepository.save(book)).thenReturn(book);
        assertEquals(book, bookService.save(book));
    }

}
