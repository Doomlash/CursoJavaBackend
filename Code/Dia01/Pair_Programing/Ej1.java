package Dia01.Pair_Programing;

import java.util.Scanner;

/*
* Un programa en el cual el usuario ingresa un color del arcorirs y se le indica en que posicion esta.
* Devuelve un mensaje si el color no se considera de los 7 colores del arcoiris
*/
public class Ej1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un color del arcoiris: ");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        int posicion = 0;
        switch (color) {
            case "rojo":
                posicion = 1;
                break;
            case "naranja":
                posicion = 2;
                break;
            case "amarillo":
                posicion = 3;
                break;
            case "verde":
                posicion = 4;
                break;
            case "azul":
                posicion = 5;
                break;
            case "indigo":
                posicion = 6;
                break;
            case "violeta":
                posicion = 7;
                break;            
            default:
                System.out.println("El color dado no se encuentra en el arcoiris");
                break;
        }
        if(posicion!=0){
            System.out.println("El color dado se encuentra en la posicion "+String.valueOf(posicion));
        }
    }
}
