package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
@Controller

public class CounterController {
	@RequestMapping("/counter")
	public String home() {
		return "count.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp";
	}
	@RequestMapping("/")
	public String index(HttpSession session) {
		
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		else {
            int count = (Integer) session.getAttribute("count");
            session.setAttribute("count", count + 1);
		}
		return "index.jsp";
	}
	@RequestMapping("/2")
	public String index2(HttpSession session) {
		
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		else {
            int count = (Integer) session.getAttribute("count");
            session.setAttribute("count", count + 2);
		}
		return "index.jsp";
	}
	
}
