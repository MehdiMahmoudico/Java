package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	public List<Book> findallBooks() {
		return bookRepo.findAll();
	}
	
	public Book findBook(Long id) {
		 Optional<Book> book = bookRepo.findById(id);
			if (book.isPresent()) {
				return book.get();
			} else {
				return null;
			}
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
	public Book findBytitle(String title) {
        return bookRepo.findBytitle(title);
	}

	public Optional<Book> findById(Long id) {
		return bookRepo.findById(id);
	}
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	 public List<Book> searchBooksByTitle(String title) {
	        return bookRepo.findByTitleContaining(title);
	    }
}
