package com.victorze.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victorze.blog.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/authors")
@AllArgsConstructor
public class AuthorController {

    private UserRepository userRepository;

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("author/index", "users", userRepository.findAll());
    }

}
