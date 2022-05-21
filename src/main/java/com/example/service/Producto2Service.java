package com.example.service;

import java.util.*;
import com.example.model.Producto2;
import com.example.repository.Producto2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producto2Service {

    @Autowired
    Producto2Repository repository;

    //List Productos
    public List<Producto2> list() {
        return repository.findAll();
    }

    //Save Producto
    public Producto2 save(Producto2 producto2) {
        return repository.save(producto2);
    }
}
