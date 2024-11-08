package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll();
	Book findBytitle(String title);
	Book findById(long id);
	@Query("SELECT b FROM Book b WHERE b.title LIKE %:title%")
    List<Book> findByTitleContaining(@Param("title") String title);
	
}
