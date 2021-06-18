package com.divyansh.dev.expense_manager.repository;

import com.divyansh.dev.expense_manager.dto.UserDTO;
import com.divyansh.dev.expense_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    Optional<User> findById(Integer id);

    @Override
    List<User> findAll();

    User findByUsername(String username);
}
