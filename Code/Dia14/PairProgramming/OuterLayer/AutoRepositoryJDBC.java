package springboot.main.OuterLayer;

import java.util.Collection;

import springboot.main.DomainLayer.Auto;
import springboot.main.RepositoriesLayer.AutoRepository;

public class AutoRepositoryJDBC implements AutoRepository {

    @Override
    public Auto getAutoByMarcaModelo(String marca, String modelo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAuto(String marca, String modelo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addAuto(Auto auto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Collection<Auto> getAutosByMarca(String marca) {
        // TODO Auto-generated method stub
        return null;
    }
}
