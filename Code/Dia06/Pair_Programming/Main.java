package PairProgramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Heroe h1 = new HeroeImpl(100, 50, 50, "test", null);
        ClassStrategyFactory c1 = new ClassStrategyFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija clase: 1 para Guerrero, 2 para Mago, 3 para Cazador");
        int opc = sc.nextInt();

        h1.cambiarClase(c1.createClassStrategy(opc));
        h1.atacar();
        h1.defender();
        h1.descansar();

        System.out.println("Elija otra clase");
        opc = sc.nextInt();


        h1.cambiarClase(c1.createClassStrategy(opc));
        h1.atacar();
        h1.defender();
        h1.descansar();

        System.out.println("Elija la ultima clase");
        opc = sc.nextInt();
        h1.cambiarClase(c1.createClassStrategy(opc));
        h1.atacar();
        h1.defender();
        h1.descansar();









    }


}
