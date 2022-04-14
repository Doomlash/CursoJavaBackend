package Dia06.Pair_Programming;

public class Guerrero implements ClassStrategy {
    @Override
    public void atacar(int attackDamage, int attackspeed) {
        System.out.println("El guerrero ataca con un daño de " + attackDamage*2 + " y a una velocidad de : " + attackspeed/2);
    }

    @Override
    public void defender(int defensa) {
        System.out.println("El guerrero disminuye el daño en " + defensa);
    }

    @Override
    public void descansar() {
        System.out.println("El guerrero descansa");
    }
}
