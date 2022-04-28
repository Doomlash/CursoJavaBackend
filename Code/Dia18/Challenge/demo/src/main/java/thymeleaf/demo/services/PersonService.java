package thymeleaf.demo.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thymeleaf.demo.Repositories.PersonRepository;
import thymeleaf.demo.model.Person;



@Service
public class PersonService {

    @Autowired
    PersonRepository pr;

    public List<Person> getPersons(){
        List<Person> l = new LinkedList<Person>();
        for (Person person : pr.findAll()) {
            l.add(person);
        }
        return l;
    }
    public void deletePerson(Integer id){
        pr.deleteById(id);
    }
    public void addPerson(Person p) {       
        pr.save(p);
    }
}