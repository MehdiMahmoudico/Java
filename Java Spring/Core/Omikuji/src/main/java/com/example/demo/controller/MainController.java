package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.OmikujiForm;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "redirect:/omikuji";
    }

    @GetMapping("/omikuji")
    public String omikuji(Model model) {
        model.addAttribute("command", new OmikujiForm()); 
        return "omikuji.jsp"; 
    }

    @PostMapping("/omikuji/process")
    public String processOmikuji(OmikujiForm formData, HttpSession session) {
        session.setAttribute("formData", formData);
        return "redirect:/omikuji/show";
    }
    @GetMapping("/omikuji/show")
    public String showOmikuji(HttpSession session, Model model) {
        OmikujiForm formData = (OmikujiForm) session.getAttribute("formData");
        if (formData != null) {
            model.addAttribute("formData", formData);
        }
        return "show.jsp";
    }

}
