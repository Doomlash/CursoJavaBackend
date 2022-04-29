package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Masita {
    private Integer id;
    private String name;
    private String sabor;
    private boolean sinTACC;

    @Override
    public String toString() {
        return "Masita [id=" + id + ", name=" + name + ", sabor=" + sabor + ", sinTACC=" + sinTACC + "]";
    }

}
