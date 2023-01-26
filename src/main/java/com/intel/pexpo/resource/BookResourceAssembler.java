/*
package com.intel.pexpo.resource;


import com.intel.pexpo.entity.Book;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookResourceAssembler {
    @Autowired
    Mapper mapper;

    public Book toEntity(BookResource bookResource, Class<Book> bookClass) {
      return   mapper.map(bookResource, bookClass);
    }

    public BookResource toResource(Book entity) {
        BookResource bookResource = mapper.map(entity, BookResource.class);
        return bookResource;
    }
}
*/
