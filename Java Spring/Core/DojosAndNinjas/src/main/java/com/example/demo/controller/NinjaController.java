package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Dojo;
import com.example.demo.model.Ninja;
import com.example.demo.service.DojoService;
import com.example.demo.service.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	

	@GetMapping("/dojos")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.findallDojos();
		model.addAttribute("dojos", dojos);
		return "dojo.jsp";
	}
	@PostMapping("/dojos")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas";
		}
	}
	
	@GetMapping("/ninjas")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.findallDojos();
		model.addAttribute("dojos", dojos);
		model.addAttribute("ninja", ninja);
		return "ninja.jsp";
	}
	@GetMapping("/ninjas/list")
	public String index(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Ninja> ninjas = ninjaService.findAllNinjas();
		model.addAttribute("ninjas", ninjas);
		return "ninja.jsp";
	}
	@PostMapping("/ninjas")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable("id") Long id,@ModelAttribute("ninja") Ninja ninja,  Model model) {
        Dojo dojo = dojoService.findDojo(id);
        List<Ninja> ninjas = ninjaService.findNinja(id);
        model.addAttribute("dojo", dojo);
        model.addAttribute("ninjas", ninjas);
        return "show.jsp";
    }
		
	}

