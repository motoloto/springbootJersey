package com.motoloto.springbootJersey.service;

import com.motoloto.springbootJersey.dao.BookDao;
import com.motoloto.springbootJersey.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by motoloto on 2017/6/2.
 */
@Service
public class BookService {

    @Autowired
    BookDao dao;

    public BookService(){
    }

    public BookService(BookDao dao) {
        this.dao = dao;
    }

    public Collection getAllBooks() {
        return dao.getAll();
    }

    public Book getBook(String oid) {
        return dao.getBookById(oid);
    }

    public void addBook(Book book) {
        dao.createOrUpdate(book);
    }

    public void updateBook(String oid, Book book) {
        dao.createOrUpdate(book);
    }

    public void deleteBook(String oid) {
        dao.delete(oid);
    }
}
