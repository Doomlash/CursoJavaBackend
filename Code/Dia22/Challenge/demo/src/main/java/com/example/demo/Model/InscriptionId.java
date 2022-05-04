package com.example.demo.Model;

import java.io.Serializable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InscriptionId implements Serializable{
    public Materia materia;
    public Estudiante estudiante;
}
