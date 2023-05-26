package com.example.service;

import com.example.IDAO.IDao;
import com.example.beans.Garde;
import com.example.repository.GardeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardeService implements IDao<Garde> {
    @Autowired
    private GardeRep gardeRep;

    @Override
    public Garde save(Garde c) {
        return gardeRep.save(c);
    }

    @Override
    public Garde findById(int id) {
        return gardeRep.findById(id);
    }

    @Override
    public List<Garde> findAll() {
        return gardeRep.findAll();
    }

    @Override
    public void delete(Garde c) {
                gardeRep.delete(c);
    }

    @Override
    public void update(Garde c) {
            gardeRep.save(c);
    }
}
