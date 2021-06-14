package com.divyansh.dev.expense_manager.service;

import com.divyansh.dev.expense_manager.dto.UserDTO;
import com.divyansh.dev.expense_manager.model.User;
import com.divyansh.dev.expense_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


}
