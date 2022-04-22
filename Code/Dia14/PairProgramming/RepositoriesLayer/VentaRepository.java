package springboot.main.RepositoriesLayer;

import java.util.Collection;

import springboot.main.DomainLayer.Auto;
import springboot.main.DomainLayer.Venta;

public interface VentaRepository {
    public Venta getVentaByNroVenta(int nroVenta);
    public void deleteVenta(int nroVenta);
    public void createVenta(Venta venta);
    public Collection<Venta> getVentasBySucursal(String Sucursal);
    public Collection<Venta> getVentasByAuto(Auto auto);
    public Collection<Venta> getVentasByVendedor(String vendedor);
    public Collection<Venta> getVentasVyCliente(String Cliente);
}
