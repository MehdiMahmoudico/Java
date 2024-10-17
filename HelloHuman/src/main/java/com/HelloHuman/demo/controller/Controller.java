package com.HelloHuman.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {
	@GetMapping("/{times}")
    public String index(@RequestParam(value="name" , defaultValue = "human", required=false) String searchQuery ,
    		@RequestParam(value="last_name", defaultValue = "",required = false)String searchQuery2,
    		@PathVariable("times") int x
    		) {
		StringBuilder repeat = new StringBuilder();
		if(x <= 0) {
			 return "Hello " + searchQuery+" "+searchQuery2;
		}else {
			for(int i= 0;i<x;i++) {
				repeat.append("Hello " + searchQuery+" "+searchQuery2);	}
		}
			
		  return repeat.toString();       
    }
	
}
