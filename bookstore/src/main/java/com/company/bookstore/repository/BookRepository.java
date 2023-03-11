package com.company.bookstore.repository;

import com.company.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Set<Book> findByAuthorId(Integer authorId);
}