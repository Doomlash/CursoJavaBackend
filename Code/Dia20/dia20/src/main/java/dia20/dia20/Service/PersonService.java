package dia20.dia20.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import dia20.dia20.Model.Person;

@Service
public class PersonService {
    Map<Integer,Person> people = new HashMap<Integer,Person>();

    public Collection<Person> getAll() {
        people.put(1, new Person(1,"asd","asd"));
        return people.values();
    }

    public void add(Person p) {
        people.put(p.getDni(), p);
    }


}
