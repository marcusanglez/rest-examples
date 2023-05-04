package com.example.dataaccess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.dataaccess.entities.User;
import com.example.dataaccess.repo.UserRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /*public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public @ResponseBody String addNewUser(
            @RequestParam String name
            , @RequestParam String email
    ){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
