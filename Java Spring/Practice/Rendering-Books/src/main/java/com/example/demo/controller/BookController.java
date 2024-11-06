package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String index(Model model) {
		 List<Book> books = bookService.findallBooks();
		 model.addAttribute("books", books);
		 return "home.jsp";
	}
	@PostMapping("/books")
	public Book create(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
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

