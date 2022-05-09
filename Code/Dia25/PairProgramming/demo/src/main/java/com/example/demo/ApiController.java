package com.example.demo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController{
    @GetMapping("/success")
    public String logIn(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getAuthorities());
        Collection<SimpleGrantedAuthority> a = (Collection<SimpleGrantedAuthority>) auth.getAuthorities();
        List<SimpleGrantedAuthority> l = new LinkedList<SimpleGrantedAuthority>(a);
        System.out.println(auth.getAuthorities());
        for (SimpleGrantedAuthority simpleGrantedAuthority : l) {
            if(simpleGrantedAuthority.getAuthority().compareTo("ROLE_ADMIN")==0){
                return "redirect:/admin";
            }
        }
        for (SimpleGrantedAuthority simpleGrantedAuthority : l) {
            if(simpleGrantedAuthority.getAuthority().compareTo("ROLE_USER")==0){
                return "redirect:/user";
            }
        }
        return "redirect:/hello";
    }
    @GetMapping("/hello")
    public String helloWorld(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("asd", auth.getAuthorities());
        return "index";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
}
