package dia20.dia20.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import dia20.dia20.Model.Person;

@Service
public class PersonService {
    Map<Integer,Person> people = new HashMap<Integer,Person>();
    boolean init;

    public Collection<Person> getAll() {
        if(init){
            people.put(1, new Person(1,"asd","asd"));
            people.put(2, new Person(2,"asd","asd"));
            people.put(3, new Person(3,"asd","asd"));
        }
        return people.values();
    }

    public void add(Person p) {
        people.put(p.getDni(), p);
    }

    public Object getByDNI(int dni) {
        return people.get(dni);
    }

    public void delete(int dni) {
        people.remove(dni);
    }


}
