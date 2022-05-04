package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(InscriptionId.class)
public class Inscripcion {
    @Id
    @ManyToOne
    @JoinColumn(name = "materia")
    public Materia materia;
    @Id
    @ManyToOne
    @JoinColumn(name = "estudiante")
    public Estudiante estudiante;
}
