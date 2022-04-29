package com.example.demo.DatabaseConnections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.example.demo.controllers.MasitaRequest;
import com.example.demo.model.Masita;

import lombok.Getter;

@Entity
@Getter
public class MasitaJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String sabor;
    private boolean sinTACC;

    @Transient
    private Masita masita = new Masita();

    public MasitaJPA(){
        masita = new Masita();
    }

    public MasitaJPA(MasitaRequest m){
        masita = new Masita();
        setName(m.getName());
        setSabor(m.getSabor());
        setSinTACC(m.isSinTACC());
        masita.setId(id);
    }

    public void setName(String name) {
        this.name = name;
        masita.setName(name);
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
        masita.setSabor(sabor);
    }

    public void setSinTACC(boolean sinTACC) {
        this.sinTACC = sinTACC;
        masita.setSinTACC(sinTACC);
    }

    @Override
    public String toString() {
        return "MasitaJPA [id=" + id + ", masita=" + masita + ", name=" + name + ", sabor=" + sabor + ", sinTACC="
                + sinTACC + "]";
    }

}
