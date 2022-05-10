package com.example.demo.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Integer dni;
    private String name;
    private String surname;
    private String phone;
    @ManyToMany
    @JoinTable(
        name = "inscription", 
        joinColumns = @JoinColumn(name = "student_dni"), 
        inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses;
}
