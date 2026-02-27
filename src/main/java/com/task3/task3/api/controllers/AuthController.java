package com.task3.task3.api.controllers;

import com.task3.task3.business.abstracts.UserService;
import com.task3.task3.entities.concretes.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getuser")
    public User getUser(@RequestParam String username) {
        return userService.getByUsername(username);
    }
}