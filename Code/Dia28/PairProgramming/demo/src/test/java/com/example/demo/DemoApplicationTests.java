package com.example.demo;

import com.example.demo.Repositories.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
	private UserRepository ur;
    @Autowired
    private PasswordEncoder pe;

	

	@Test
    void contextLoads() {
        
    }

}
