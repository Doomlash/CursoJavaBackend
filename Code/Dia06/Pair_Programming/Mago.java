package PairProgramming;

public class Mago implements ClassStrategy{
    @Override
    public void atacar(int attackDamage, int attackSpeed) {
        System.out.println("El mago ataca con " + attackDamage + "daño magico y a una velocidad de " + attackSpeed);
    }

    @Override
    public void defender(int defensa) {
        System.out.println("El mago absorbe con un escudo " + defensa + " puntos de vida." );
    }

    @Override
    public void descansar() {
        System.out.println("El mago descansa.");
    }
}
