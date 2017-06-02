package com.motoloto.springbootJersey.dao;

import com.motoloto.springbootJersey.model.Book;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by motoloto on 2017/6/2.
 */

@Component
public class BookDao {
    Map<String,Book> bookList;

    public BookDao() {
        this.bookList =new HashMap<String, Book>();
        Book book1 =new Book("1","HarryPotter", "J.K");
        bookList.put(book1.getId(),book1);
        Book book2= new Book("2","Double","Arer");
        bookList.put(book2.getId(),book2);
    }

    public Collection<Book> getAll(){ return bookList.values();}

    public Book getBookById(Integer id){
        return bookList.get(id);
    }

    public void createOrUpdate(Book book) {
        bookList.put(book.getId(),book);
    }

    public void delete(String oid) {
        bookList.remove(oid);
    }
}
