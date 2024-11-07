package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.LoginUser;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String getRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("LoginUser", new LoginUser());
		return "Auth/index.jsp";
	}
	@GetMapping("/home")
	public String getHome(Model model, HttpSession session) {
		Long userId= (Long)session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user  = userService.findUserById(userId);
		model.addAttribute("user", user);
		return "home.jsp";
	}
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result,Model model, HttpSession session) {
		User newUser = userService.register(user, result);
		if (result.hasErrors()) {
			model.addAttribute("LoginUser", new LoginUser());
			return "Auth/index.jsp";
		}else {
		return "redirect:/";}
	}
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("LoginUser") LoginUser loginuser, BindingResult result, Model model,
			HttpSession session) {
		User user = userService.login(loginuser, result);
		if (result.hasErrors()) {
			model.addAttribute("user", new User());
			return "Auth/index.jsp";
		}else {
			session.setAttribute("userId", user.getId());
		return "redirect:/home";}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
