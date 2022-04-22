package springboot.main.RepositoriesLayer;

import java.util.Collection;

import springboot.main.DomainLayer.Auto;

public interface AutoRepository {
    
    public Auto getAutoByMarcaModelo(String marca, String modelo);
    public void deleteAuto(String marca, String modelo);
    public void addAuto(Auto auto);
    public Collection<Auto> getAutosByMarca(String marca);
}
