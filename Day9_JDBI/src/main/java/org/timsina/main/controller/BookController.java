package org.timsina.main.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.timsina.main.model.Book;
import org.timsina.main.service.BookService;
import org.timsina.main.service.impl.BookServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")

public class BookController {
	BookServiceImpl bookService;

	public BookController(BookServiceImpl bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	
}
