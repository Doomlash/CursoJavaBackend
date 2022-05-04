package com.example.demo.Repositories;

import com.example.demo.Model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
    
}
