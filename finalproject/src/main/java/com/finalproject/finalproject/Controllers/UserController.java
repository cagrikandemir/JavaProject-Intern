package com.finalproject.finalproject.Controllers;

import com.finalproject.finalproject.Entities.User;
import com.finalproject.finalproject.repos.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
       return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/{userId}")
    public User GetOneUser(@PathVariable Long userId){
        return userRepository.findById(userId).orElse(null);
    }

    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser){
        Optional<User> user=userRepository.findById(userId);
        if(user.isPresent()){
            User foundUser=user.get();
            foundUser.setUsername(newUser.getUsername());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }
        else
            return null;

    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId){
        userRepository.deleteById(userId);
    }
}
