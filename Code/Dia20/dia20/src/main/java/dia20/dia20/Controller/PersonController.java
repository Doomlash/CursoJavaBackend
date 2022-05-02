package dia20.dia20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dia20.dia20.Model.Person;
import dia20.dia20.Service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService ps;
    boolean first = true;
    
    @GetMapping
    public String main(Model model){
        model.addAttribute("layout","empty");
        return "main_page";
    }

    @GetMapping("/list")
    public String listPeople(Model model){
        model.addAttribute("people", ps.getAll());
        model.addAttribute("layout", "list_people");
        return "main_page";
    }

    @GetMapping("/post")
    public String showPersonForm(Model model){
        model.addAttribute("newPerson", new Person());
        model.addAttribute("layout", "add_people");
        return "main_page";
    }

    @PostMapping("/post")
    public String postPerson(Person p){
        ps.add(p);
        return "redirect:/person/list";
    }

    @GetMapping("/dni")
    public String dniForm(Model model){
        model.addAttribute("layout", "find_people_form");
        return "main_page";
    }
    @GetMapping("/dniGet")
    public String showByDni(@RequestParam int dni, Model model){
        model.addAttribute("layout", "show_person");
        model.addAttribute("getPerson", ps.getByDNI(dni));
        return "main_page";
    }

    @RequestMapping("/dniForm")
    public String dniGet(@RequestParam int dni){
        System.out.println("asd");
        System.out.println(dni);
        return "redirect:/person/list";
    }
}
