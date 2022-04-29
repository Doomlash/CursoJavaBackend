package com.example.demo.Repositories;

import com.example.demo.DatabaseConnections.MasitaJPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasitaRepository extends CrudRepository<MasitaJPA,Integer>{
    
}
