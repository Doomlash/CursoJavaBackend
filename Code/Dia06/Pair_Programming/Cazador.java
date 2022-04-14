package Dia06.Pair_Programming;

public class Cazador implements ClassStrategy{
    @Override
    public void atacar(int attackDamage, int attackSpeed) {
        System.out.println("El cazador ataca con un daño de : " +attackDamage/2 + " y a una velocidad de " + attackSpeed*2);
    }

    @Override
    public void defender(int defensa) {
        System.out.println("El cazador esquiva con una chance de " + defensa + " %");
    }

    @Override
    public void descansar() {
        System.out.println("El cazador descansa");
    }
}
