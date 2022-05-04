package com.example.demo.Repositories;

import com.example.demo.Model.Inscripcion;
import com.example.demo.Model.InscriptionId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion,InscriptionId> {
    
}
