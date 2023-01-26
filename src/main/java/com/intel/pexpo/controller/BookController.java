package com.intel.pexpo.controller;


import com.intel.pexpo.entity.Book;
import com.intel.pexpo.resource.BookResource;
import com.intel.pexpo.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    /*@Autowired
    BookResourceAssembler bookResourceAssembler;
*/
    /*@PostMapping("/saveBook")
    public ResponseEntity<BookResource> saveBook(@RequestBody BookResource bookResource) {
        Book book = bookResourceAssembler.toEntity(bookResource, Book.class);
        book = bookService.save(book);
        bookResource = bookResourceAssembler.toResource(book);
        return new ResponseEntity<>(bookResource, HttpStatus.OK);
    }*/

    Logger logger = LoggerFactory.getLogger(BookController.class);

    @PostMapping("/saveBook")
    public String saveBook(@RequestBody Book book){
        logger.debug("Request {}", book);
        bookService.save(book);
        String s = "saveBook";
        /*if (s.equalsIgnoreCase("saveBook")) {
            throw new RuntimeException("Opps Exception raised....");
        }*/
        String response = "Hi " + s + " Welcome to Java Techie";
        logger.debug("Response {}", response);
        System.out.println("respons eof logger"  +response);
        return response;
    }

    @GetMapping("/message")
    public String getMessage(){
        logger.debug("hi");
        logger.warn("hello");
        logger.error("how are you");
        logger.trace("excel");
        return "success";
    }
}
