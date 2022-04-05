package Dia02.Pair_Programming;

import java.util.Random;
import java.util.Scanner;

import javax.crypto.ShortBufferException;

public class Main {
    public static void main(String[] args) {
        BoardInterface jugador1 = new BoardMediumImpl();
        BoardInterface jugador2 = new BoardMediumImpl();
        int l = jugador1.getSize();
        Random random = new Random();
        int gamemode;
        Scanner scanner = new Scanner(System.in);
        jugador2.insertShip(0, 4, 0);
        int barcos = 0;
        int x,y;
        while(barcos<2){
            System.out.println("Ingrese coordenada y direccion de barcos. Las direcciones son 1 para arriba, 2 para derecha, 3 para abajo y 4 para izquierda");
            if(jugador1.insertShip(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())){
                barcos++;
                System.out.println("Barco ingresado con exito");
                mostrarBoard(jugador1, l);
            }
            else{
                System.out.println("la posicion del barco no es valida");
            }
        }
        boolean gameOver = false;

        while(!gameOver){
            boolean disparoExitoso = false;
            while(!disparoExitoso){    
                System.out.print("Inserte disparo: ");
                x = scanner.nextInt();
                y = scanner.nextInt();
                if(jugador2.getTile(x,y)!=-1){
                    disparoExitoso = true;
                    if(jugador2.shoot(x, y)){
                        System.out.println("Golpe!!!");
                    } else {
                        System.out.println("Fallo");
                    }   
                } else {
                    System.out.println("disparo no valido");
                }
            }
            if(jugador2.allClear()){
                gameOver = true;
            } else {
                System.out.println("La computadora hace su tiro");
                x = random.nextInt(jugador1.getSize());
                y = random.nextInt(jugador1.getSize());
                if(jugador1.shoot(x, y)){
                    System.out.println("Golpe!!!");
                } else {
                    System.out.println("Fallo");
                }
                mostrarBoard(jugador1, l);
                if(jugador1.allClear()){
                    gameOver = true;
                }
            }
        }
        System.out.print("Juego Terminado.");
        if(jugador1.allClear()){
            System.out.println("Perdiste =(");
        } else {
            System.out.println("Ganaste!!!");
        }

    }

    private static void mostrarBoard(BoardInterface b, int l) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                int tile = b.getTile(j, i);
                if(tile==0){
                    System.out.print("~ ");
                } else if(tile == 1){
                    System.out.print("# ");
                } else if(tile == 2){
                    System.out.print("& ");
                }
            }
            System.out.println();
        }
    }
}
