package Dia01.Lectura_Tarde;

import java.util.Scanner;

/**
 * MainEsPrimo
 */
public class MainEsPrimo {

    public static void main(String[] args) {
        System.out.println("Ingrese numero entre 1 y 14:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==1||n==4||n==6||n==8||n==9||n==10||n==12||n==14) {
            System.out.println("El numero no es primo");
        } else if(n==2||n==3||n==5||n==7||n==11||n==13){
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no se encuentra en el rango esperado");
        }
    }
}