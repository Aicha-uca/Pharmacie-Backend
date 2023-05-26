package com.example.repository;


import com.example.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRep extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

}
