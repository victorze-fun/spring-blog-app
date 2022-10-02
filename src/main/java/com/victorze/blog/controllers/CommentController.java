package com.victorze.blog.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.victorze.blog.entities.Comment;
import com.victorze.blog.entities.User;
import com.victorze.blog.repositories.CommentRepository;
import com.victorze.blog.repositories.PostRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CommentController {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    @PostMapping("/posts/{id}/comments")
    public String store(Comment comment, @PathVariable long id, @AuthenticationPrincipal User user) {
        comment.setUser(user);
        comment.setPost(postRepository.findById(id).get());
        commentRepository.save(comment);
        return "redirect:/posts/" + id;
    }

}
