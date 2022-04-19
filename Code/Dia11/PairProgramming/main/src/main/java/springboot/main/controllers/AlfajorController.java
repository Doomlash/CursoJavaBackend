package springboot.main.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springboot.main.models.Alfajor;
import springboot.main.services.AlfajorService;

@RestController
@RequestMapping("/alfajor")
public class AlfajorController {

    AlfajorService aService = new AlfajorService();

    @GetMapping()
    public ArrayList<Alfajor> getAlfajores()
    {
        return aService.getAlfajores();
    }

    @GetMapping("/types")
    public ArrayList<Alfajor> getAlfajoresByType(@RequestParam("type") String type)
    {
        return aService.getAlfajoresByType(type);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id)
    {
        aService.deleteById(id);
    }
    @PostMapping("/post")
    public void putAlfajor(@RequestParam("type") String type, @RequestParam("stock") String stock, @RequestParam("lote") String lote)
    {
        aService.putAlfajor(new Alfajor(type, Integer.parseInt(stock), Long.parseLong(lote)));
    }
}
