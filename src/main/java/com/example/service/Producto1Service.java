package com.example.service;

import java.util.*;
import com.example.model.Producto1;
import com.example.repository.Producto1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producto1Service {

    @Autowired
    Producto1Repository repository;

    //List Productos
    public List<Producto1> list() {
        return repository.findAll();
    }

    //Save Producto
    public Producto1 save(Producto1 producto1) {
        return repository.save(producto1);
    }
}
