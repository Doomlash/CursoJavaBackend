package com.example.demo.Services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.demo.Controllers.PuntoRequest;
import com.example.demo.Model.Punto;
import com.example.demo.Repositories.PuntoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuntoService {
    @Autowired
    private PuntoRepository pr;

    public void save(Punto punto) {
        pr.save(punto);
    }

    public Punto findClosest() {
        return pr.findClosest();
    }

    public double findAverage() {
        return pr.findAverage();
    }


    public Collection<Punto> findAll() {
        return pr.findAllActive();
    }

    @Transactional
    public void deleteById(int id) {
        pr.logicDelete(id);
    }

    @Transactional
    public void undo() {
        pr.undo(pr.lastDeleted());
    }

    public void saveNew(PuntoRequest punto) {
        pr.save(new Punto(punto.getX(), punto.getY()));
    }

    public void delete(int id) {
        pr.deleteById(id);
    }

    public Punto getById(int id) {
        Optional<Punto> p = pr.findById(id);
        if(p.isPresent()){
            return p.get();
        }
        else{
            return null;
        }
    }

    public List<Punto> findAllPosta(){
        return pr.findAll();
    }
    
}
