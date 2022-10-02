package com.victorze.blog.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victorze.blog.entities.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
