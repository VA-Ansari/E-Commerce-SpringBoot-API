package com.arshad.Springsignupapi.Controller;

import com.arshad.Springsignupapi.Entity.User.User;
import com.arshad.Springsignupapi.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")   //ADDING USER (SIGNUP)
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/signup")     //GET ALL USERS
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") String id){
        return userService.getById(id);
    }

    @GetMapping("/signup/{fullName}")     //GET USER BY FULL NAME
    public User getUserByName(@PathVariable("fullName") String fullName){
        return userService.getUserByFullName(fullName);
    }





}
