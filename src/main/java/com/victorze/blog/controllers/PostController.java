package com.victorze.blog.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victorze.blog.entities.Post;
import com.victorze.blog.entities.User;
import com.victorze.blog.repositories.PostRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PostController {

    private PostRepository postRepository;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("posts/index", "posts", postRepository.findTop10ByOrderByCreatedAtDesc());
    }

    @GetMapping("/posts/create")
    public String create() {
        return "posts/create";
    }

    @PostMapping("/posts")
    public String store(Post post, @AuthenticationPrincipal User user) {
        post.setAuthor(user);
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/posts/{id}")
    public ModelAndView show(@PathVariable long id) {
        return new ModelAndView("posts/show", "post", postRepository.findById(id).get());
    }

}
