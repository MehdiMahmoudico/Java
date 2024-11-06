package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Burger;
import com.example.demo.repository.BurgerRepository;

@Service
public class BurgerService {
	private BurgerRepository burgerRepo;
	
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	public Burger createBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	
	public List<Burger> findallBurgers() {
        return burgerRepo.findAll();
    }

}
