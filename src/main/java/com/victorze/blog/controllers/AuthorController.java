package com.victorze.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victorze.blog.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AuthorController {

    private UserRepository userRepository;

    @GetMapping("/authors")
    public ModelAndView index() {
        return new ModelAndView("authors/index", "users", userRepository.findAll());
    }

}
