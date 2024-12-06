package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Book;
import com.example.demo.model.User;
import com.example.demo.service.BookService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String index(Model model,HttpSession session) {
		 Long userId= (Long)session.getAttribute("userId");
		 if (userId == null) {
				return "redirect:/";
			}
		 User user  = userService.findUserById(userId);
		 List<Book> books = bookService.findallBooks();
		 	model.addAttribute("books", books);
			model.addAttribute("user", user);
			return "home.jsp";
	}
	@GetMapping("/books")
	public String newBook(@ModelAttribute("book") Book book, Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user  = userService.findUserById(userId);
		model.addAttribute("book", book);
		return "newbook.jsp";
	}
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		 Long userId= (Long)session.getAttribute("userId");
		 if (userId == null) {
				return "redirect:/";
			}
		 User user  = userService.findUserById(userId);
		if(result.hasErrors()) {
            return "newbook.jsp";
            }else {
            	book.setUserc(user);
            	bookService.createBook(book);
            	return "redirect:/home";
            }	
	}
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user  = userService.findUserById(userId);
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		model.addAttribute("user", user);
		return "show.jsp";
	}
	@DeleteMapping("/books/delete/{id}")
	public String delete(@PathVariable("id") Long id, HttpSession session) {
		bookService.deleteBook(id);
		return "redirect:/home";
	}
	@GetMapping("/books/lib/{id}")
	public String showby(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user  = userService.findUserById(userId);
		Book book = bookService.findBook(id);
		if (userId != book.getUserc().getId()) {
			return "redirect:/home";
		}
		model.addAttribute("book", book);
		return "addbook.jsp";
	}
	@PutMapping("/books/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result, Model model , HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null  ) {
			return "redirect:/";
		}
		User user  = userService.findUserById(userId);
		if(result.hasErrors()) {
            model.addAttribute("book", book);
            return "addbook.jsp";
            }
		else {
			book.setUserc(user);
            bookService.updateBook(book);
            return "redirect:/home";}
		}

	 @GetMapping("/search")
	    public String searchBooks(@RequestParam("title") String title, Model model, HttpSession session) {
		 Long userId= (Long)session.getAttribute("userId");
		 if (userId == null) {
				return "redirect:/";
			}
		 User user  = userService.findUserById(userId);
	        List<Book> books = bookService.searchBooksByTitle(title);
	        model.addAttribute("books", books);
	        model.addAttribute("user", user);
	        return "home.jsp"; // View name where you display the books
	    }
	 @GetMapping("/sbooks")
	    public String searchBookss(@RequestParam(value = "title", required = false) String title, Model model) {
	        // If no title is provided, return all books
	        List<Book> books;
	        if (title != null && !title.isEmpty()) {
	            books = bookService.searchBooksByTitle(title); // Filter books by title
	        } else {
	            books = bookService.findallBooks(); // Return all books if no search term
	        }

	        model.addAttribute("books", books);
	        return "home.jsp"; // The name of the JSP view
	    }
	 

	}

