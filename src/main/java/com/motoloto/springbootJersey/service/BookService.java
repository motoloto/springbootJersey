package com.motoloto.springbootJersey.service;

import com.motoloto.springbootJersey.dao.BookRepository;
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
    BookRepository dao;

    public BookService(){
    }

    public BookService(BookRepository dao) {
        this.dao = dao;
    }

    public List getAllBooks() {
        return dao.findAll();
    }

    public Book getBook(String oid) {
        return dao.findOne(oid);
    }

    public void addBook(Book book) {
        if(!dao.exists(book.getId())){
            dao.save(book);
        }
    }

    public void updateBook(String oid, Book book) {
        dao.save(book);
    }

    public void deleteBook(String oid) {
        dao.delete(oid);
    }
}
