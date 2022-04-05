package Dia02.Pair_Programming;

public interface BoardInterface {
    
    public int getSize();
    
    public int getTile(int x, int y);

    public boolean allClear();

    public boolean insertShip(int x, int y, int direccion);

    public boolean shoot(int x, int y);

}
