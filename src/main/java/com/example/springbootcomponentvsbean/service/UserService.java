package com.example.springbootcomponentvsbean.service;

import com.example.springbootcomponentvsbean.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService
{
    private final List<User>  list  = new ArrayList<User>();
    @PostConstruct
    private void init(){
        User user = new User(1,"Ram", "Bangalore");
        this.list.add(user);
    }

    public List<User> getListOfUser() {
    return this.list;
    }

}
