package com.example.demo.Controllers;

import com.example.demo.Repositories.EstudianteRepository;
import com.example.demo.Repositories.InscripcionRepository;
import com.example.demo.Repositories.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    EstudianteRepository er;
    @Autowired
    MateriaRepository mr;
    @Autowired
    InscripcionRepository ir;


}
