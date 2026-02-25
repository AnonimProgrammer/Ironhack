package com.ironhack.day8.mockito_junit.repository;

import com.ironhack.day8.mockito_junit.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findById(Long id);

    List<Book> findAll();

    Book save(Book book);

    void deleteById(Long id);
}
