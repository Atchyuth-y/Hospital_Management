package com.hospital.Hospital.controller;

import com.hospital.Hospital.entity.User;
import com.hospital.Hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUSer(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser(){
        return userService.getUser();
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@RequestBody User user, @PathVariable int id){
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }

}
