package thymeleaf.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import thymeleaf.demo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
    
}
