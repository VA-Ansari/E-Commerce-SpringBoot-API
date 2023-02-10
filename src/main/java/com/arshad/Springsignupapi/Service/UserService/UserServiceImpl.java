package com.arshad.Springsignupapi.Service.UserService;

import com.arshad.Springsignupapi.Entity.User.User;
import com.arshad.Springsignupapi.Entity.User.UserSignIn;
import com.arshad.Springsignupapi.Error.UserNotFoundException;
import com.arshad.Springsignupapi.Repository.UserRepo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private User user;

    @Override
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User getUserByFullName(String fullName) {
        return userRepository.findByFullName(fullName);
    }

    @Override
    public User signIn(UserSignIn signIn) throws UserNotFoundException {
        user = userRepository.findOneByUserUniqueIdAndPassword(signIn.getUserUniqueId(), signIn.getPassword());

        if (signIn.getUserUniqueId().equals(user.getUserUniqueId()) && signIn.getPassword().equals(user.getPassword()))
            return userRepository.findOneByUserUniqueIdAndPassword(signIn.getUserUniqueId(), signIn.getPassword());
        else
            throw new UserNotFoundException("User Not Found");

    }


}
