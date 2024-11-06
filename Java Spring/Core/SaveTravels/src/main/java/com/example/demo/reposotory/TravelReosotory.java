package com.example.demo.reposotory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Travel;

@Repository
public interface TravelReosotory extends JpaRepository<Travel, Long> {
	List<Travel> findAll();
	Travel findById(long id);
}
