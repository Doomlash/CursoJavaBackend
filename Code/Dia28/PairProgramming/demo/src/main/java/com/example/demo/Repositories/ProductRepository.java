package com.example.demo.Repositories;

import java.util.List;

import com.example.demo.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    

    @Query(nativeQuery = true,value = "SELECT * FROM product WHERE DATE(:start)<date AND date<date(:end)")
    public List<Product> getByDate(@Param("start") String start, @Param("end") String end);

}
