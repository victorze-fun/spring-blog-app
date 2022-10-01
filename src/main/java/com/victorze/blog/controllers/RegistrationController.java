package com.victorze.blog.controllers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.victorze.blog.config.RegistrationForm;
import com.victorze.blog.repositories.UserRepository;
import com.victorze.blog.utils.Flash;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/register")
@AllArgsConstructor
public class RegistrationController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String registerForm() {
        return "auth/register";
    }

    @PostMapping
    public String processRegistration(RegistrationForm form, RedirectAttributes ra) {
        userRepository.save(form.toUser(passwordEncoder));
        Flash.success("Usuario registrado, inicie sesión con sus credenciales.", ra);
        return "redirect:/login";
    }

}
