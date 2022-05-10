package com.example.demo.Controllers;

import com.example.demo.Controllers.Repositories.CourseRepository;
import com.example.demo.Controllers.Repositories.StudentRepository;
import com.example.demo.Controllers.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    StudentRepository er;
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
