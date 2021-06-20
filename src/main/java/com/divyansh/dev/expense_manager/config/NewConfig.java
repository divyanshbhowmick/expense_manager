package com.divyansh.dev.expense_manager.config;

import com.divyansh.dev.expense_manager.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {

    @Bean
    public User getUser(){
        System.out.println("user");
        return new User();

    }
}
