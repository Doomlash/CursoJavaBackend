package springboot.main.DomainLayer;

public class Venta {
    private int nroVenta;
    private Auto auto;
    private String sucursal;
    private String vendedor;
    private String cliente;
    private String monto;
    public Venta(int nroVenta, Auto auto, String sucursal, String vendedor, String cliente, String monto) {
        this.nroVenta = nroVenta;
        this.auto = auto;
        this.sucursal = sucursal;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.monto = monto;
    }
    public int getNroVenta() {
        return nroVenta;
    }
    public Auto getAuto() {
        return auto;
    }
    public String getSucursal() {
        return sucursal;
    }
    public String getVendedor() {
        return vendedor;
    }
    public String getCliente() {
        return cliente;
    }
    public String getMonto() {
        return monto;
    }
}
