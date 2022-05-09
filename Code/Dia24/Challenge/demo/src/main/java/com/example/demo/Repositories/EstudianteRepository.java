package com.example.demo.Repositories;

import com.example.demo.Model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Student,Integer> {
    
}
