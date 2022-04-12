package Dia05.Pair_Programming;

import java.util.List;

public class TableManager implements ITableManager {
    
    private List<Mesa> mesas;
    
    @Override
    public void chequearMesas(List<Mesa> mesas) {
        int flag = 0;
        for (Mesa mesa : mesas) {
            if (!mesa.isIsOcupada() && flag == 0) {
                System.out.println("Hay una mesa desocupada: " + mesa.getNroMesa());
                mesa.setIsOcupada(true);
                flag = 1;
            }
        }
    }
}
