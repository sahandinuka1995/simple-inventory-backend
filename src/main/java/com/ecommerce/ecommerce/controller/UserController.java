package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.dto.UserDTO;
import com.ecommerce.ecommerce.entity.User;
import com.ecommerce.ecommerce.repository.UserRepo;
import com.ecommerce.ecommerce.util.StandardResponse;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity<StandardResponse> addNewUser(@RequestBody UserDTO userDto) {
        try {
            User user = new User();
            user.setName(userDto.getName());
            user.setTel(userDto.getTel());
            user.setAddress(userDto.getAddress());
            user.setPassword(userDto.getPassword());

            userRepo.save(user);
            return ResponseEntity.ok(new StandardResponse(0, "", "Operation Successfull", true));
        } catch (Exception e) {
            return ResponseEntity.ok(new StandardResponse(1, "", "Something went wrong", false));
        }
    }
}
