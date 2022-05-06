package connection.connection.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import connection.connection.Model.Person;
import connection.connection.Service.PersonService;


@Controller
public class PersonController {
    @Autowired
    PersonService ps;

    @GetMapping()
    public String mainView(Model model) {
        model.addAttribute("persons", ps.getAll());
        return "index";
    }

    @GetMapping("/save")
    public String postView(Model model){
        model.addAttribute("person", new Person());
        return "addPerson";
    }

    @PostMapping("/save")
    public String postPerson(@Valid Person person, BindingResult results){
        boolean badPassword = false;
        String pw = person.getPassword();
        boolean hasMayus = false, hasMinus = false, hasNumber = false;
        for (char c : pw.toCharArray()) {
            if(!hasNumber && c>=48 && c<=57){
                hasNumber=true;
            }
            if(!hasMayus && c>=65 && c<=90){
                hasMayus = true;
            }
            if(!hasMinus && c>=97 && c<=122){
                hasMinus = true;
            }
        }
        if(!hasMayus || !hasMinus || !hasNumber){
            badPassword=true;
        }
        if(results.hasErrors()||badPassword){
            if(badPassword){
                results.addError(new FieldError("person","password", "Must contain at least a lowercase letter, an uppercase letter and a number"));
            }
            return "addPerson";
        }
        
        
        ps.postPerson(person);
        return"redirect:/";
    }    
    
}
