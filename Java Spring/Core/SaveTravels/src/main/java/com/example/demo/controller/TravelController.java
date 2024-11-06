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

import com.example.demo.model.Travel;
import com.example.demo.service.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	@Autowired
	private TravelService travelService;
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelService.findallTravels();
		model.addAttribute("travels", travels);
		return "index.jsp";
	}
	@PostMapping("/travels")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			travelService.createTravel(travel);
			return "redirect:/expenses";
		}
	}
	@GetMapping("/travels/edit/{id}")
	public String updateTravel(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	@PutMapping("/travels/{id}")
	public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("travel", travel);
			return "edit.jsp";
		} else {
			travelService.updateTravel(travel);
			return "redirect:/expenses";
		}
	}
	@DeleteMapping("/travels/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
		return "redirect:/expenses";
	}
	@GetMapping("/expenses/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		return "show.jsp";
	}
	
	
	
}
