package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
