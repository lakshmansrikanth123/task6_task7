package com.tes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("course1", "Java Full Stack");
        model.addAttribute("course2", "DevOps with AWS");
        model.addAttribute("course3", "Frontend Development");
        return "courses";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String name, Model model) {
        model.addAttribute("message", "Thank you " + name + " for contacting TES Institute!");
        return "contact";
    }
}
