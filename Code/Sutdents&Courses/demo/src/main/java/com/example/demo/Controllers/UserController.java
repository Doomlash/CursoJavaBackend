package com.example.demo.Controllers;

import javax.validation.Valid;

import com.example.demo.Controllers.Requests.UserRequest;
import com.example.demo.Controllers.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService us;

    @GetMapping
    public String mainUsers(Model model){
        model.addAttribute("layout", "user_main");
        model.addAttribute("view", "empty");
        return "index";
    }

    @GetMapping("/show")
    public String showUsers(Model model){
        model.addAttribute("layout", "user_main");
        model.addAttribute("view", "user_view");
        model.addAttribute("users", us.getAll());
        return "index";
    }

    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("layout", "user_main");
        model.addAttribute("view", "user_create");
        model.addAttribute("userRequest", new UserRequest());
        return "index";
    }

    @PostMapping(value="/create")
    public String postUser(@Valid UserRequest ur,BindingResult result, Model model) {
        if(result.hasErrors()){
            model.addAttribute("layout", "user_main");
            model.addAttribute("view", "user_create");
            return "index";
        }
        us.postUser(ur);
        
        return "redirect:/users/show";
    }
    
    @PostMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        us.deleteUser(id);
        return"redirect:/users/show";
    }
    




}
