package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import com.example.demo.Model.Product;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Services.ProductService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    
    @Autowired
    ProductService ps;

    @MockBean
    private ProductRepository pr;

	@Test
    public void getByDateTest() throws Exception {
    
    Date start = Date.valueOf("2022-03-10");
    Date end = Date.valueOf("2022-07-10");

    List<Product> pl = new LinkedList<>();
    pl.add(new Product(1, "oreo", 145, Date.valueOf("2022-05-10")));

    // given(pr.getByDate(start.toString(), end.toString())).willReturn(pl);
    when(pr.getByDate(start.toString(), end.toString())).thenReturn(pl);
    
    List<Product> result = ps.getByDate(start, end);

    assertEquals(pl,result);
}

}
