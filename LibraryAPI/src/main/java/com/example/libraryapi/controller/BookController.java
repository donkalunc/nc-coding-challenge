package com.example.libraryapi.controller;

import com.example.libraryapi.model.Book;
import com.example.libraryapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/don-library")
public class BookController {

    public String hello() {
        return String.format("Hello World");
    }

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getLibraryBooks() {
        return bookRepository.findAll();
    }
}
