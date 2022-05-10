package com.example.demo.Controllers.Repositories;

import com.example.demo.Model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
    
}
