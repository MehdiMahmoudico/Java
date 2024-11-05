package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookSercice;

@RestController
public class BookController {
	
	@Autowired
	private BookSercice bookService;
	
	@GetMapping("/books")
	public List<Book> index() {
		return bookService.findallBooks();
	}
	@PostMapping("/books")
	public Book create(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	@GetMapping("/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		return bookService.findBook(id);
	}
	@DeleteMapping("/books/{id}")
	public void delete(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
	@GetMapping("/books/lib/{title}")
	public Book show(@PathVariable("title") String title) {
		return bookService.findBytitle(title);
	}
	@PutMapping("/books/update/{id}")
	public ResponseEntity<Book> update(@PathVariable("id") Long id, @RequestBody Book book) {
	    Optional<Book> existBook = Optional.of(bookService.findBook(id));
	    
	    if (existBook.isPresent()) {
	        book.setId(id);
	        Book updatedBook = bookService.updateBook(book);
	        return ResponseEntity.ok(updatedBook);
	    } else {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	    }
	}

}

