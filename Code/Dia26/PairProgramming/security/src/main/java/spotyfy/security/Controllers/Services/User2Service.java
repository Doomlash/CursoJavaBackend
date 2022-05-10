package spotyfy.security.Controllers.Services;

import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RestTemplate restTemplate = new RestTemplate();
     
        final String baseUrl = "http://localhost:8081/employees";
        URI uri;
        try {
            JSONObject json = new JSONObject();
            json.put("username", );
            uri = new URI(baseUrl);
            ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
            return null;
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
            
        
    }
    
}
