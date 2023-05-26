package com.example.repository;


import com.example.beans.Garde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GardeRep extends JpaRepository<Garde, Integer> {

    Garde findById(int id);

    Garde findByType(String type);
}
