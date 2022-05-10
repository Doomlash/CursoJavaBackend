package com.example.demo.Repositories;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.MyUser;
import com.example.demo.Model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser,String>  {


    @Query(value = "SELECT role.id,role.name FROM my_user JOIN role WHERE my_user.username=:username", nativeQuery = true)
    public List<Role> getRoles(@Param("username") String username);

    public Optional<MyUser> findByUsername(String username);
}
