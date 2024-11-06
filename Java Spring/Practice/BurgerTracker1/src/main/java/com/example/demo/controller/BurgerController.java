package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Burger;
import com.example.demo.service.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired
	private BurgerService burgerService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("burger") Burger burger, Model model) {
		 List<Burger> burgers = burgerService.findallBurgers();
		 model.addAttribute("burgers", burgers);
		 return "index.jsp";
	}
	@PostMapping("/burgers")
	public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }
	}
	
}
