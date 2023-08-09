package com.example.springbootcomponentvsbean.controller;

import com.example.springbootcomponentvsbean.config.UseConfig;
import com.example.springbootcomponentvsbean.entity.User;
import com.example.springbootcomponentvsbean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController
{
    @Autowired
    private UserService userService;

     @Autowired
     private User user;

    @GetMapping("/users")
    List<User> getAllUsers(){
   return userService.getListOfUser();
    }

    @GetMapping("/getUser")
    String getUser(){
        System.out.println(user);
        return "bean for user is created and assigned to application context";
    }

}
