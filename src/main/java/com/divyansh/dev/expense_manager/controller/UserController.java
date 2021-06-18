package com.divyansh.dev.expense_manager.controller;

import com.divyansh.dev.expense_manager.dto.UserDTO;
import com.divyansh.dev.expense_manager.model.User;
import com.divyansh.dev.expense_manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        if (userService.findAll().isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No users found!");
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        if (userService.findById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No user found with id " + String.valueOf(id));

        }
        return userService.findById(id);
    }

    @GetMapping("/name/{username}")
    public User getUserByName(@PathVariable String username) {
        return userService.findByUsername(username);
    }
}
