package com.example.demo.Controllers;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import com.example.demo.Model.Product;
import com.example.demo.Services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class ProductController {
    @Autowired
    ProductService ps;


    @GetMapping()
    public ResponseEntity<List<Product>> getAll() {
        try {

            return new ResponseEntity<>(ps.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product item) {
        try {
            Product savedItem = ps.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/p2w")
    public ResponseEntity<Object> getByDate(@RequestBody HashMap<String,String> dates){
        String startString, endString;
        startString = dates.get("start");
        endString = dates.get("end");
        if(startString == null && endString == null){
            return new ResponseEntity<>("La Request debe contener un campo 'start' y un campo 'end'", HttpStatus.BAD_REQUEST);
        }
        try {
            Date start = Date.valueOf(startString); 
            Date end = Date.valueOf(endString);
            return new ResponseEntity<>(ps.getByDate(start, end),HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>("Las fechas deben tener el formato 'yyyy-mm-dd'", HttpStatus.BAD_REQUEST);
        }
        
    }

    @GetMapping("/plebe")
    public ResponseEntity<Product> getOneLikeAPeasant() {
        try {
            List<Product> l = ps.findAll();
            Product p = l.get((int)Math.floor(Math.random() * (l.size())));
            return new ResponseEntity<>(p, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}
