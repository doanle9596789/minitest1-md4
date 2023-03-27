package com.service;

import com.model.Painting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaintingServiceIpm implements PaintingService {
    private List<Painting> paintings= new ArrayList<>();
    @Override
    public List<Painting> findAll() {

        return paintings;
    }




    @Override
    public Painting findById(Long id) {
        return null;
    }

    @Override
    public void save(Painting painting) {
        paintings.add(painting);
    }

    @Override
    public void update(Long id, Painting painting) {

    }

    @Override
    public void remove(Long id) {

    }
}
