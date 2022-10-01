package com.victorze.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PostController {

    @GetMapping("/posts/create")
    public String create() {
        return "posts/create";
    }

}
