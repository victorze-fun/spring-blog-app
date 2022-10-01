package com.victorze.blog.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.victorze.blog.config.RegistrationForm;
import com.victorze.blog.entities.User;
import com.victorze.blog.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping()
@AllArgsConstructor
public class AuthController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String loginForm(@AuthenticationPrincipal User user) {
        if (user != null) {
            return "redirect:/";
        }
        return "auth/login";
    }

    @GetMapping("/register")
    public String registerForm(@AuthenticationPrincipal User user) {
        if (user != null) {
            return "redirect:/";
        }
        return "auth/register";
    }

    @PostMapping("/register")
    public String processRegistration(RegistrationForm form, RedirectAttributes ra) {
        userRepository.save(form.toUser(passwordEncoder));
        ra.addFlashAttribute("success", "Usuario registrado, inicie sesión con sus credenciales.");
        return "redirect:/login";
    }

}
