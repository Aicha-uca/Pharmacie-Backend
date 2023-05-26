package com.example.IDAO;

import java.util.List;

public interface IDao<T> {
    T save(T c);
    T findById(int id);
    List<T> findAll();

    void delete(T c);
    void update(T c);
}
