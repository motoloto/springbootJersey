package com.motoloto.springbootJersey.dao;

import com.motoloto.springbootJersey.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by motoloto on 2017/6/2.
 */

@Component
public interface BookRepository extends JpaRepository<Book, String> {


}
