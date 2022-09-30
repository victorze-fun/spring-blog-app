package com.victorze.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.victorze.blog.entities.User;
import com.victorze.blog.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/register")
@AllArgsConstructor
public class RegistrationController {

    private UserRepository userRepository;

    @GetMapping
    public String registerForm() {
        return "auth/register";
    }

    @PostMapping
    public String processRegistration(User user) {
        userRepository.save(user);
        System.out.println(user);
        return "redirect:/authors";
    }

}
