package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.Masita;
import com.example.demo.services.MasitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/masita")
public class MasitaController {
    
    @Autowired
    @Qualifier("JPA")
    MasitaService ms;

    @GetMapping()
    public ResponseEntity<List<Masita>> getAllMasitas() {
        return ResponseEntity.ok(ms.findAllMasitas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Masita> getMethodName(@PathVariable Integer id) {
        Masita m = ms.findMasitaById(id);
        if(m==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        else{
            return ResponseEntity.ok(m);
        }
    }
    
    @PostMapping()
    public ResponseEntity<String> postMasita(@RequestBody MasitaRequest m) {
        if(ms.addMasita(m)){
            return ResponseEntity.status(HttpStatus.CREATED).body("Se a creado correctamente");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Fallo la creacion de la masita");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> putMasita(@PathVariable Integer id, @RequestBody MasitaRequest m) {
        if(!ms.modifyMasita(id, m)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no existe una masita con esa id");
        }
        else{
            return ResponseEntity.ok("Masita editada exitosamente");
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMasita(@PathVariable Integer id) {
        if(!ms.deleteMasita(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no existe una masita con esa id");
        }
        else{
            return ResponseEntity.ok("Masita borrada exitosamente");
        }
    }
    
}
