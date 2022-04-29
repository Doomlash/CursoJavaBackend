package com.example.demo.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.example.demo.controllers.MasitaRequest;
import com.example.demo.model.Masita;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("local")
public class MasitaServiceLocal implements MasitaService{
    Map<Integer,Masita> masitas = new HashMap<Integer,Masita>();
    int id = 1;

    @Override
    public boolean addMasita(MasitaRequest m) {
        masitas.put(id, new Masita(id, m.getName(), m.getSabor(), m.isSinTACC()));
        id++;
        return true;
    }

    @Override
    public boolean deleteMasita(Integer id) {
        if(masitas.remove(id)==null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public List<Masita> findAllMasitas() {
        return new LinkedList<Masita>(masitas.values());
    }

    @Override
    public Masita findMasitaById(Integer id) {
        return masitas.get(id);
    }

    @Override
    public boolean modifyMasita(Integer id, MasitaRequest m) {
        if(!masitas.containsKey(id)){
            return false;
        }
        else{
            Masita masita = masitas.get(id);
            masita.setName(m.getName());
            masita.setSabor(m.getSabor());
            masita.setSinTACC(m.isSinTACC());
            return true;
        }
    }


}
