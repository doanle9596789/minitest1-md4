package com.service;

import com.model.Painting;

import java.util.List;

public interface PaintingService {
    List<Painting> findAll();

    Painting findById(Long id);

    void save(Painting painting);

    void update(Long id, Painting painting);

    void remove(Long id);
}
