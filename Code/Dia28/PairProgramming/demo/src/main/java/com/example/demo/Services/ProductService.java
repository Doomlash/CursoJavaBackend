package com.example.demo.Services;

import java.sql.Date;
import java.util.List;

import com.example.demo.Model.Product;
import com.example.demo.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public List<Product> findAll() {
        return pr.findAll();
    }

    public Product save(Product item) {
        return null;
    }
    public List<Product> getByDate(Date start, Date end){
        return pr.getByDate(start.toString(), end.toString());
    }
}
