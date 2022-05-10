package com.example.demo.Services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Model.MyUser;
import com.example.demo.Model.Role;
import com.example.demo.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {

    @Autowired
    UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("asdasdasdsadsadsadsa");
        Optional<MyUser> optional = ur.findById(username);
        if (optional.isEmpty()) {
            System.out.println("asd");
            throw new UsernameNotFoundException(username);
        }
        MyUser u = optional.get();
        List<GrantedAuthority> c = new LinkedList<>();
        for(Role role:ur.getRoles(username)){
            System.out.println(role.getName());
            c.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new User(u.getUsername(), u.getPassword(), c);
    }
    
}
