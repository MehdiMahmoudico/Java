package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Daikichicontroller {
	@RequestMapping("/")
	public String getMethodName() {
		return "Welcome!";
	}
	@RequestMapping("/daikichi/travel/{country}")
	public String today(@PathVariable("country") String country) {
		return "Congratulations! You will soon travel to" + " " + country;
	}
	@RequestMapping("/daikichi/lotto/{x}")
	public String tomorrow(@PathVariable("x") int x
			) {
		if(x%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}
