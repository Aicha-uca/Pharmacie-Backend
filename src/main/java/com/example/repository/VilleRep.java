package com.example.repository;


import com.example.beans.Ville;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VilleRep extends JpaRepository<Ville, Integer> {
    Ville findById(int id);
}
