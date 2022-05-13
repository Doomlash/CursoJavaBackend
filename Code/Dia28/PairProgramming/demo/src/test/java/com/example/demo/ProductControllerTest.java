package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import com.example.demo.Model.Product;
import com.example.demo.Services.ProductService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductControllerTest {

    @Autowired
	private WebApplicationContext webC;
	private MockMvc mvc;

    @MockBean
    private ProductService service;

    private String token;

    @Before
    public void init() throws Exception{
        JSONObject j = new JSONObject();
        j.put("username", "admin");
        j.put("password", "123");
        mvc = MockMvcBuilders.webAppContextSetup(webC).build();
        token = mvc.perform(post("/token/generate-token")
                    .content(j.toString())
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse()
                    .getContentAsString();
    }

    @Test
	public void getProducts() throws Exception {

        List<Product> pl = new LinkedList<>();
        Product p = new Product(1, "oreo", 145, Date.valueOf("2022-05-10"));
        pl.add(p);
        when(service.findAll()).thenReturn(pl);

        // String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY1MjQ3MDQxNSwiZXhwIjoxNjUyNDc0MDE1fQ.IIV5MrUJ9Q16DPRDIcla38ojEbFrfAlrD44v4jTnsgs";
		String producs = mvc.perform(get("/p")
            .header("Authorization","Bearer "+ token)
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();
        JSONArray j = new JSONArray(producs);
        assertTrue(j.length()==1);
        JSONObject j2 = j.getJSONObject(0);
        //la comparacion no funciona. NICO HELP!!!
	}

    @Test
	public void getProductsUnauthorized() throws Exception {
        token = "token.trucho";
        List<Product> pl = new LinkedList<>();
        Product p = new Product(1, "oreo", 145, Date.valueOf("2022-05-10"));
        pl.add(p);
        when(service.findAll()).thenReturn(pl);
		String products = mvc.perform(get("/p")
            .contentType(MediaType.APPLICATION_JSON))
            //NICO HELP AGAIN!!!
            .andExpect(status().isOk())
            .andReturn().getResponse().getContentAsString();
        System.out.println("asdadsadsadsadasdasdsa");
        System.out.println(products);
	}
}
