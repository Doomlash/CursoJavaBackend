package com.example.demo.Controllers;

import com.example.demo.Repositories.CourseRepository;
import com.example.demo.Repositories.EstudianteRepository;
import com.example.demo.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    EstudianteRepository er;
    @Autowired
    CourseRepository mr;
    @Autowired 
    UserService us;

    @GetMapping
    public String mainView(Model model){
        model.addAttribute("layout", "main");
        return "index";
    }

}
