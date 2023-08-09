package com.example.springbootcomponentvsbean.config;

import com.example.springbootcomponentvsbean.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseConfig {
    @Bean
    public User getUserBean(){
     return new User(2,"Deepak", "Noida");
    }
}
