package connection.connection.Service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import connection.connection.Model.Person;

@Service
public class PersonService {

    public boolean delete(int id) {
        return false;
    }

    public boolean post(Person p) {
        return false;
    }

    public boolean put(Person p) {
        return false;
    }

    public Person getOne(int id) {
        return null;
    }

    public Collection<Person> getAll() {
        return null;
    }
    
}
