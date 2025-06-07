package com.userservice.userservice.controller;


import com.userservice.userservice.model.User;
import com.userservice.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/api/end_user")
public class UserController {

    @Autowired
    private UserService userService;
    
    // Endpoint to register a new user
    @PostMapping("/register")
    public ResponseEntity<?> registerUser( @RequestBody User user) {
       // System.out.println("User  "+user);
       // System.out.println("User  "+user.getEmail());
        user.setId(10L);
        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        user.setCreatedAt(timestamp);
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
        
        
    }
   
}
