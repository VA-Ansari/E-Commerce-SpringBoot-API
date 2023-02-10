package com.arshad.Springsignupapi.Service.UserService;

import com.arshad.Springsignupapi.Entity.User.User;
import com.arshad.Springsignupapi.Entity.User.UserSignIn;
import com.arshad.Springsignupapi.Error.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User user);

    List<User> getAllUsers();

    User getUserByFullName(String fullName);

    User signIn(UserSignIn userSignIn) throws UserNotFoundException;

    User getById(String id);
}
