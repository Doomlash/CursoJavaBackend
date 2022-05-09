package connection.connection.Service;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import connection.connection.Model.Person;

@Service
public class PersonService {
    private String url="http://localhost:8080/";
    private RestTemplate rt = new RestTemplate();

    public Person[] getAll() {
        Person[] people = rt.getForObject(url,Person[].class);
        return people;
    }

    public void postPerson(Person person) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject personJsonObject = new JSONObject();
        personJsonObject.put("dni", person.getDni());
        personJsonObject.put("name", person.getName());
        personJsonObject.put("phone", person.getPhone());
        personJsonObject.put("email", person.getEmail());
        personJsonObject.put("password", person.getPassword());
        HttpEntity<String> request = new HttpEntity<String>(personJsonObject.toString(), headers);
        String personResultAsJsonStr = rt.postForObject(url, request, String.class);
        System.out.println(personResultAsJsonStr);
    }
    
}
