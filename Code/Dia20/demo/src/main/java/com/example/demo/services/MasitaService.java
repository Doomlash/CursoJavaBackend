package com.example.demo.services;

import java.util.List;

import com.example.demo.controllers.MasitaRequest;
import com.example.demo.model.Masita;

import org.springframework.stereotype.Service;

@Service
public interface MasitaService {
    public boolean addMasita(MasitaRequest m);
    public boolean deleteMasita(Integer id);
    public List<Masita> findAllMasitas();
    public Masita findMasitaById(Integer id);
    public boolean modifyMasita(Integer id, MasitaRequest m);
}
