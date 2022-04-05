package Dia02.Challenges_individuales;

import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {
        boolean terminar = false;
        float a,b,r;
        String op;
        try{
            Scanner scanner = new Scanner(System.in);
            r = 0;
            System.out.print("primer numero: ");
            a = scanner.nextInt();
            System.out.print("segundo numero: ");
            b = scanner.nextInt();
            System.out.print("Ingrese 's' para suma, 'r' para resta, 'm' para multiplicacion o 'd' para division.\nOperacion: ");
            op = scanner.next();
            switch (op) {
                case "s":
                    r = a + b;
                    break;
                case "r":
                    r = a - b;
                    break;
                case "m":
                    r = a * b;
                    break;
                case "d":
                    r = a / b;
                    break;
                default:
                    System.out.println("la ingresada no es una operacion valida");
            }
            System.out.println("Respuesta = "+String.valueOf(r));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
