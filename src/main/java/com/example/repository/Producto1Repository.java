package com.example.repository;

import com.example.model.Producto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Producto1Repository extends JpaRepository<Producto1, Integer> {

}
