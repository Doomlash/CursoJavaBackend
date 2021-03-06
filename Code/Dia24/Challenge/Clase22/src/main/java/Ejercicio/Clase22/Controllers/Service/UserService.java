package Ejercicio.Clase22.Controllers.Service;

import Ejercicio.Clase22.Controllers.Repository.UserRepository;
import Ejercicio.Clase22.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository ur;
    public Page<User> getAllUsers(int pagNum, int pagSize) { /*return (ArrayList<User>) ur.findAll(); */
        Pageable cantidad= PageRequest.of(pagNum-1, pagSize);
        return ur.findAll(cantidad);
    }
    public User findById(long id) { return ur.findById(id); }
    public void save(User user) { ur.save(user); }


}
