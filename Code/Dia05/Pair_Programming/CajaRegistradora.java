package Dia05.Pair_Programming;

public class CajaRegistradora implements Caja{
    private double saldo;
    @Override
    public double chequearSaldo() {
        return saldo;
    }

    @Override
    public void ingresarDinero(double monto) {
        saldo+=monto;
    }

    @Override
    public void retirarDinero(double monto) {
        saldo-=monto;
    }
    
}
