package com.example.demo.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MasitaRequest {
    private String name;
    private String sabor;
    private boolean sinTACC;
}