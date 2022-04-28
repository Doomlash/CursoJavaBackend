package thymeleaf.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import thymeleaf.demo.model.Person;
import thymeleaf.demo.services.PersonService;

@Controller
public class PersonController {
    @Autowired
    PersonService ps;

    @GetMapping()
    public String getPersons(Model model) {
        model.addAttribute("persons", ps.getPersons());
        return "index"; 
    }

    @GetMapping("/create") 
	public String showPersonForm(Model model) {
		model.addAttribute("person", new Person());
		return "createPerson";
	}

    @GetMapping("/empty")
    public Optional<Object> empty(){
        return Optional.empty();
    }
    
    @PostMapping("/create")
    public String postPerson(Person p){
        ps.addPerson(p);
        return "redirect:/";
    }
    
}
