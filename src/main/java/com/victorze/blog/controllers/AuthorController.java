package com.victorze.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.victorze.blog.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/authors")
@AllArgsConstructor
public class AuthorController {

    private UserRepository userRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("page", "authors");
        return "author/index";
    }

}
