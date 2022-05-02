package dia21.pp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dia21.pp.Model.Alfajor;
import dia21.pp.Services.AlfajorService;

@Controller
public class AlfajorController {
    @Autowired
    AlfajorService as;

    @GetMapping
    public String mainView(Model model){
        model.addAttribute("alfajores", as.findAll());
        return "index";
    }

    @GetMapping("/buy/{id}")
    public String formView(@PathVariable int id, Model model) {
        model.addAttribute("alfajor", id);
        return "buy_form";
    }

    @PostMapping("/ticket/{id}")
    public String ticketPost(
        @RequestParam("name") String nombre,
        @RequestParam("dni") Integer dni,
        @RequestParam("tarjeta") Integer tarjeta,
        @PathVariable("id") Integer id,
        RedirectAttributes ra){
        ra.addFlashAttribute("nombre", nombre);
        ra.addFlashAttribute("tarjeta", tarjeta);
        ra.addFlashAttribute("dni", dni);
        ra.addFlashAttribute("alfajor", as.getById(id));
        return "redirect:/ticket";
    }

    @GetMapping("/ticket")
    public String ticketView(
                        @ModelAttribute("nombre")String nombre,
                        @ModelAttribute("tarjeta")Integer tarjeta,
                        @ModelAttribute("dni")Integer dni,
                        @ModelAttribute("alfajor")Alfajor alfajor,
                        Model model){

        model.addAttribute("nombre",nombre);
        model.addAttribute("dni",dni);
        model.addAttribute("tarjeta",tarjeta);
        model.addAttribute("alfajor", alfajor);

        return "ticket";
    }
}
