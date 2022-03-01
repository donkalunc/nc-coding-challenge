package com.example.libraryapi;

import com.example.libraryapi.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.libraryapi.model.Book;

@SpringBootApplication
public class LibraryApiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(LibraryApiApplication.class, args);
        BookRepository bookRepository =
        configurableApplicationContext.getBean(BookRepository.class);
//        Book myBook = new Book("Don Test Book","Don Kalu","TestGenre");
//        bookRepository.save(myBook);
    }

}
