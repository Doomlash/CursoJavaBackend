package springboot.main.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import springboot.main.models.Alfajor;

@Service
public class AlfajorService {

private static ArrayList<Alfajor> alfajores = new ArrayList<Alfajor>();



    public ArrayList<Alfajor> getAlfajores()
    {
        return alfajores;
    }

    public void putAlfajor(Alfajor alfajor)
    {
        alfajores.add(alfajor);
    }

    public void deleteById(int id)
    {
        for(int i = 0; i< alfajores.size(); i++)
        {
            if(id == alfajores.get(i).getOwnId())
            {
                alfajores.remove(i);
                break;
            }
        }
    }

    public ArrayList<Alfajor> getAlfajoresByType(String type)
    {
        ArrayList<Alfajor> alfajorFilter = new ArrayList<Alfajor>();

        for(Alfajor alfajor: alfajores)
        {
            if(alfajor.getType().equals(type))
            {
                alfajorFilter.add(alfajor);
            }
        }
        return alfajorFilter;
    }

}
