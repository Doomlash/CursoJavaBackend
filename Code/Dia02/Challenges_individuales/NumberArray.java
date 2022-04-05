package Dia02.Challenges_individuales;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int array[] = new int[10];
            System.out.println("Ingrese 10 numeros, si ingresa mas, el restante sera ignorado.");
            for (int i = 0; i < 10; i++) {
                array[i] = scanner.nextInt();
            }
            int aOrdenar, aux;
            int ordenados = 0;
            boolean enSuLugar = false;
            while(ordenados < 10){
                aOrdenar = ordenados;
                enSuLugar = false;
                while(!enSuLugar){
                    if(aOrdenar==0 || array[aOrdenar]>array[aOrdenar-1]){
                        enSuLugar = true;
                    } else {
                        aux = array[aOrdenar];
                        array[aOrdenar] = array[aOrdenar-1];
                        array[aOrdenar-1] = aux;
                        aOrdenar--;
                    }
                }
                ordenados++;
            }
            System.out.println("mayor = "+String.valueOf(array[9]));
            System.out.println("menor = "+String.valueOf(array[0]));
            System.out.print("pares = ");
            for (int i : array) {
                if(i%2==0){
                    System.out.print(String.valueOf(i)+" ");
                }
            }
            System.out.println();
            System.out.print("impares = ");
            for (int i : array) {
                if(i%2!=0){
                    System.out.print(String.valueOf(i)+" ");
                }
            }
            System.out.println();
            System.out.print("en orden ascendente = ");
            for (int i : array) {
                System.out.print(String.valueOf(i) + " ");
            }
            System.out.println();
            System.out.print("en orden descendente = ");
            for (int i = 9; i >=0 ; i--) {
                System.out.print(String.valueOf(array[i]) + " ");
            }
            System.out.println();
        }

        
    }
}
