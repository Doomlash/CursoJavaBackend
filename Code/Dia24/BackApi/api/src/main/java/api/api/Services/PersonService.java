package api.api.Services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import api.api.Model.Person;

@Service
public class PersonService {
    Map<Integer,Person> people = new HashMap<Integer,Person>();

    public boolean delete(int id) {
        if(people.remove(id)!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean post(Person p) {
        if(people.get(p.getDni())!=null){
            return false;
        }else{
            String email = p.getEmail();
            if(!email.endsWith(".com")||!email.contains("@")){
                return false;
            }
            String pw = p.getPassword();
            boolean hasMayus = false, hasMinus = false, hasNumber = false;
            for (char c : pw.toCharArray()) {
                if(!hasNumber && c>=48 && c<=57){
                    hasNumber=true;
                }
                if(!hasMayus && c>=65 && c<=90){
                    hasMayus = true;
                }
                if(!hasMinus && c>=97 && c<=122){
                    hasMinus = true;
                }
            }
            if(!hasMayus || !hasMinus || !hasNumber){
                return false;
            }
            people.put(p.getDni(), p);
            return true;  
        }
        
    }

    public boolean put(Person p) {
        if(people.get(p.getDni())==null){
            return false;
        }
        people.put(p.getDni(), p);
        return true;
    }

    public Person getOne(int id) {
        return people.get(id);
    }

    public Collection<Person> getAll() {
        return people.values();
    }


}
