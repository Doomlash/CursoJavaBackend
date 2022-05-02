package dia21.pp.Controllers.Services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import dia21.pp.Model.Alfajor;

@Service
public class AlfajorService {
    
    Map<Integer,Alfajor> alfajores = new HashMap<Integer,Alfajor>();
    
    boolean iniciado = false;

    public Collection<Alfajor> findAll(){
        if(!iniciado){
            alfajores.put(1, new Alfajor(1, "Guaymayen negro simple", "Alfajor doble bañado en chocolate",60.50));
            alfajores.put(2, new Alfajor(2,"Aguila negro","Alfajor triple relleno de mouse y bañado en chocolate",150.00));
            alfajores.put(3, new Alfajor(3, "Pepitos", "Alfajor triple  bañado en chocolate con masa de pepitos",600.00));
        }
        return alfajores.values();
    }

    public Object getById(int id) {
        return alfajores.get(id);
    }

}
