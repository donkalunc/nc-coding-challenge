package com.example.libraryapi.controller;

import com.example.libraryapi.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {

    @Test
    void hello() {
        BookController controller = new BookController(); // Arrange
        String response = controller.hello(); // Act
        assertEquals("Hello World", response); // Assert
    }

    @Test
    void getLibraryBooks() {
        BookController controller = new BookController(); // Arrange
        // Act
        // Assert

    }

}