package Dia02.Challenges_individuales;

import java.util.LinkedList;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntajes[] = {0,0};
        boolean gameOver = false;
        int jugadorPalabra = 1;
        int jugadorAdivina = 2;
        String pista;
        int intentosMax = 6;
        char letra;
        boolean letraRepetida = false;
        while (!gameOver) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.print("Jugador "+String.valueOf(jugadorPalabra)+" inserte una palabra: ");
            char palabra[] = scanner.next().toLowerCase().toCharArray();
            System.out.print("Inserte una pista: ");
            pista = scanner.next();
            int intentosActuales = intentosMax;
            LinkedList<Character> listaLetras = new LinkedList<Character>();
            boolean win = false;
            while(intentosActuales>0 && !win){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Adivina Jugador "+String.valueOf(jugadorAdivina));
                System.out.println("Pista: "+pista);
                System.out.println("Oportunidades Restantes: "+String.valueOf(intentosActuales));
                System.out.print("Palabra: ");
                for (Character character : palabra) {
                    if(listaLetras.indexOf(character)==-1){
                        System.out.print("_");
                    } else {
                        System.out.print(character);
                    }
                }
                System.out.print("\nLetras Utilizadas: ");
                for (Character character : listaLetras) {
                    System.out.print(character + " ");
                }
                if(letraRepetida){
                    System.out.println("\nEsa letra ya fue utilizada");
                }
                System.out.println("\nInserte una letra: ");
                letra = scanner.next().charAt(0);   
                if(listaLetras.indexOf(letra)!=-1){
                    letraRepetida = true;
                } else {
                    letraRepetida = false;
                    listaLetras.add(letra);
                    if(!inPalabra(letra, palabra)){
                        intentosActuales--;
                    }
                }
                win = terminado(palabra, listaLetras);
                
            }
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            if(win){
                System.out.println("Jugador "+String.valueOf(jugadorAdivina)+" ha ganado");
                puntajes[jugadorAdivina-1]++;
            } else {
                System.out.println("Jugador "+String.valueOf(jugadorAdivina)+" ha perdido");
            }
            System.out.println("Puntajes: ");
            System.out.println("    Jugador 1 = "+String.valueOf(puntajes[0]));
            System.out.println("    Jugador 2 = "+String.valueOf(puntajes[1]));
            if(puntajes[0]==3 || puntajes[1]==3){
                System.out.println("Juego terminado");
                gameOver = true;
            } else{
                System.out.println("Ingrese cualquier cosa para continuar el juego.");
                scanner.next();
                int temp = jugadorAdivina;
                jugadorAdivina = jugadorPalabra;
                jugadorPalabra = temp;
            }
            
        }
    }

    private static boolean terminado(char[] palabra, LinkedList<Character> listaLetras) {
        boolean win = true;
        for (int i = 0; i < palabra.length && win; i++) {
            if(listaLetras.indexOf(palabra[i])==-1){
                win = false;
            }
        }
        return win;
    }

    private static boolean inPalabra(char letra, char[] palabra) {
        for (char c : palabra) {
            if(c==letra){
                return true;
            }
        }
        return false;
    }

}
