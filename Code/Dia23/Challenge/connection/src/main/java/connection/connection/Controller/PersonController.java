package connection.connection.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import connection.connection.Model.Person;
import connection.connection.Service.PersonService;


@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    PersonService ps;
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        if(ps.delete(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Elemento borrado");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }
    }

    @PostMapping
    public ResponseEntity<String> post(@RequestBody Person p) {
        if(ps.post(p)){
            return ResponseEntity.status(HttpStatus.OK).body("Elemento posteado");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }
    }
    @PutMapping
    public ResponseEntity<String> put(@RequestBody Person p) {
        if(ps.put(p)){
            return ResponseEntity.status(HttpStatus.OK).body("Elemento puteado");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Person> getOne(@PathVariable int id) {
        Person p = ps.getOne(id);
        if(p!=null){
            return ResponseEntity.status(HttpStatus.OK).body(p);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<Collection<Person>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(ps.getAll());
    }
    
}
