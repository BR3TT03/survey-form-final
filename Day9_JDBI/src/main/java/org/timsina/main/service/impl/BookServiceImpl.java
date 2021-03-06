package org.timsina.main.service.impl;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;
import org.timsina.main.model.Book;
import org.timsina.main.repo.BookRepo;
import org.timsina.main.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	Jdbi jdbi;

	public BookServiceImpl(Jdbi jdbi) {
		this.jdbi = jdbi;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		
		BookRepo bookRepo= jdbi.onDemand(BookRepo.class);
		
		return bookRepo.getAllBooks();
	}

}
