package com.example.demo.Config;

import com.example.demo.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private AuthenticationEntryPoint authEntryPoint;
    @Autowired
    private UserService us;
    @Autowired
    private BCryptPasswordEncoder pe;

    @Override
    public void configure(HttpSecurity http) throws Exception{
        http
            .csrf().disable()
            .authorizeRequests()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic()
            .authenticationEntryPoint(authEntryPoint);
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(us).passwordEncoder(pe);
    }


}
