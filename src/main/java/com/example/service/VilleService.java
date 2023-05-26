package com.example.service;

import com.example.IDAO.IDao;
import com.example.beans.Ville;
import com.example.repository.VilleRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService implements IDao<Ville> {

    @Autowired
    private VilleRep villeRep;

    @Override
    public Ville save(Ville c) {
        return villeRep.save(c);
    }

    @Override
    public Ville findById(int id) {
        return villeRep.findById(id);
    }

    @Override
    public List<Ville> findAll() {
        return villeRep.findAll();
    }

    @Override
    public void delete(Ville c) {
            villeRep.delete(c);
    }

    @Override
    public void update(Ville c) {
            villeRep.save(c);
    }

}
