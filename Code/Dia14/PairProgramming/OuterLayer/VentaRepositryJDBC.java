package springboot.main.OuterLayer;

import java.util.Collection;

import springboot.main.DomainLayer.Auto;
import springboot.main.DomainLayer.Venta;
import springboot.main.RepositoriesLayer.VentaRepository;

public class VentaRepositryJDBC implements VentaRepository{

    @Override
    public Venta getVentaByNroVenta(int nroVenta) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteVenta(int nroVenta) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void createVenta(Venta venta) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Collection<Venta> getVentasBySucursal(String Sucursal) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Venta> getVentasByAuto(Auto auto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Venta> getVentasByVendedor(String vendedor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Venta> getVentasVyCliente(String Cliente) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
