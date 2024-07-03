package com.example.databaseconnection.controller;


import com.example.databaseconnection.model.primary.User1;
import com.example.databaseconnection.model.secondary.User2;
import com.example.databaseconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/db1")
    public List<User1> getAllUsersFromDb1() {
        return userService.getAllUsersFromDb1();
    }

    @GetMapping("/db2")
    public List<User2> getAllUsersFromDb2() {
        return userService.getAllUsersFromDb2();
    }

    @PostMapping("/db1")
    public User1 saveUserToDb1(@RequestBody User1 user1) {
        return userService.saveUserToDb1(user1);
    }

    @PostMapping("/db2")
    public User2 saveUserToDb2(@RequestBody User2 user2) {
        return userService.saveUserToDb2(user2);
    }
}
