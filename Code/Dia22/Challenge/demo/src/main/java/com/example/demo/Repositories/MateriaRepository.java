package com.example.demo.Repositories;

import com.example.demo.Model.Materia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,Integer>{
    
}
