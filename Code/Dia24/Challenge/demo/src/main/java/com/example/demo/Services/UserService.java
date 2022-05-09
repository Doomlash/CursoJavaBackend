package com.example.demo.Services;

import com.example.demo.Model.User;
import com.example.demo.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository ur;

    public Page<User> findUserPage(int pageNum, int pageSize){
        Pageable p = PageRequest.of(pageNum, pageSize);
        return ur.findAll(p);
    }
}
