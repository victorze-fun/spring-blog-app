package com.victorze.blog.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victorze.blog.entities.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
