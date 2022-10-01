package com.victorze.blog.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victorze.blog.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

    User findByUsername(String username);

}
