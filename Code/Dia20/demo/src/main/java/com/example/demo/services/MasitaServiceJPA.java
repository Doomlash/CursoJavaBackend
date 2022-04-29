package com.example.demo.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.demo.DatabaseConnections.MasitaJPA;
import com.example.demo.Repositories.MasitaRepository;
import com.example.demo.controllers.MasitaRequest;
import com.example.demo.model.Masita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("JPA")
public class MasitaServiceJPA implements MasitaService {
    @Autowired
    MasitaRepository mr;

    @Override
    public boolean addMasita(MasitaRequest m) {
        try {
            MasitaJPA mas = new MasitaJPA(m);
            System.out.println(mas.getName()+mas.getSabor());
            mr.save(mas);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteMasita(Integer id) {
        if(mr.findById(id).isEmpty()){
            return false;
        }
        else{
            mr.deleteById(id);
            return true;
        }
    }

    @Override
    public List<Masita> findAllMasitas() {
        List<Masita> l = new LinkedList<Masita>();
        for (MasitaJPA m : mr.findAll()) {
            Masita masita = new Masita(m.getId(),m.getName(),m.getSabor(),m.isSinTACC());
            l.add(masita);
        }
        return l;
    }

    @Override
    public Masita findMasitaById(Integer id) {
        Optional<MasitaJPA> m =  mr.findById(id);
        if(m.isEmpty()){
            return null;
        }
        else{
            MasitaJPA masita = m.get();
            return new Masita(masita.getId(),masita.getName(),masita.getSabor(),masita.isSinTACC());
        }
    }

    @Override
    @Transactional
    public boolean modifyMasita(Integer id, MasitaRequest m) {
        Optional<MasitaJPA> masita =  mr.findById(id);
        if(masita.isEmpty()){
            return false;
        }
        else{
            MasitaJPA masitaToUpdate = masita.get();
            masitaToUpdate.setName(m.getName());
            masitaToUpdate.setSabor(m.getSabor());
            masitaToUpdate.setSinTACC(m.isSinTACC());
            mr.save(masitaToUpdate);
            return true;
        }
    }

    
}
