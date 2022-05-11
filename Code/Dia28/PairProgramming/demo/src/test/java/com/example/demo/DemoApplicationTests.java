package com.example.demo;

import com.example.demo.Model.MyUser;
import com.example.demo.Model.Role;
import com.example.demo.Repositories.UserRepository;

import org.junit.Assert;
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
        MyUser user = new MyUser();
        user.setUsername(   "asd");
        user.setPassword(pe.encode("asd"));
        user.setRol(new Role(2, "Usuario"));

        MyUser r = ur.save(user);
        Assert.assertTrue(r.getPassword().equalsIgnoreCase(user.getPassword()));
}

}
