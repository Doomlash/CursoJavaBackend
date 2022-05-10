package com.example.demo.Services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.example.demo.Model.MyUser;
import com.example.demo.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> optional = ur.findByUsername(username);
        if (optional.isEmpty()) {
            System.out.println("asdasdasd");
            throw new UsernameNotFoundException(username);
        }
        MyUser u = optional.get();
        System.out.println("zxc");
        Set<GrantedAuthority> set = new HashSet<>();
        set.add(new SimpleGrantedAuthority(ur.getRole(username)));
        System.out.println("asd");
        User user = new User(u.getUsername(), u.getPassword(), set);
        System.out.println(user.toString());
        return user;
    }
    
}
