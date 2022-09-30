package com.victorze.blog.config;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.victorze.blog.entities.User;

import lombok.Data;

@Data
public class RegistrationForm {

    private String name;

    private String bio;

    private String username;

    private String email;

    private String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(name, bio, username, email, passwordEncoder.encode(password));
    }

}
