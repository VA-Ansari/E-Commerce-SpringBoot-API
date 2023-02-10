package com.arshad.Springsignupapi.Controller;

import com.arshad.Springsignupapi.Entity.User.UserSignIn;
import com.arshad.Springsignupapi.Entity.User.User;
import com.arshad.Springsignupapi.Error.UserNotFoundException;
import com.arshad.Springsignupapi.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {
    @Autowired
    private UserService userService;

    @GetMapping("/signIn")
    public User userSignIn(@RequestBody UserSignIn userSignIn) throws UserNotFoundException {
        return userService.signIn(userSignIn);
    }
}
