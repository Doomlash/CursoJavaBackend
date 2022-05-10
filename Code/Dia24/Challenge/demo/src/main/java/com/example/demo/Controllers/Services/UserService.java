package com.example.demo.Controllers.Services;

import com.example.demo.Controllers.Repositories.UserRepository;
import com.example.demo.Controllers.Requests.UserRequest;
import com.example.demo.Model.User;

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

    public Object getAll() {
        return ur.findAll();

    }

    public void postUser(UserRequest userRequest) {
        ur.save(new User(userRequest.getUsername(), userRequest.getPassword(), userRequest.getName(), userRequest.getEmail()));
        
    }

}
