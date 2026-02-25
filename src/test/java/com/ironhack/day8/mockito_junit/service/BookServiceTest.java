package com.ironhack.day8.mockito_junit.service;

import com.ironhack.day8.mockito_junit.Book;
import com.ironhack.day8.mockito_junit.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    // getBookById

    @Test
    void getBookById_bookExists_returnsBook() {
        Book book = new Book(12L, "Some Book", "Some Author");
        when(bookRepository.findById(12L)).thenReturn(Optional.of(book));

        Book existingBook = bookService.getBookById(12L);
        verify(bookRepository, times(1)).findById(12L);
        assertEquals(book, existingBook);
    }

    @Test
    void getBookById_bookDoesNotExist_throwsException() {
        when(bookRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> bookService.getBookById(1L));
    }

    // getAllBooks

    @Test
    void getAllBooks_bookExists_returnsAllBooks() {
        Book book = new Book(12L, "Some Book", "Some Author");
        when(bookRepository.findAll()).thenReturn(List.of(book));

        List<Book> allBooks = bookService.getAllBooks();
        verify(bookRepository, times(1)).findAll();
        assertEquals(allBooks, List.of(book));
    }

   // addBook

    @Test
    void addBook_savesBook_returnsBook() {
        Book book = new Book(12L, "Some Book", "Some Author");
        when(bookRepository.save(book)).thenReturn(book);

        Book savedBook = bookService.addBook(book);
        verify(bookRepository, times(1)).save(book);
        assertEquals(book, savedBook);
    }

    // removeBook

    @Test
    void removeBook_bookExists_deletesBook() {
        Book book = new Book(12L, "Some Book", "Some Author");
        when(bookRepository.findById(12L)).thenReturn(Optional.of(book));

        bookService.removeBook(12L);
        verify(bookRepository, times(1)).findById(12L);
    }

    @Test
    void removeBook_bookDoesNotExist_throwsException_neverDeletes() {
        when(bookRepository.findById(12L)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> bookService.removeBook(12L));

        verify(bookRepository, never()).deleteById(12L);
    }
}