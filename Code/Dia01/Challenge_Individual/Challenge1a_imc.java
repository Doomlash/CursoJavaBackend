package Dia01.Challenge_Individual;

import java.util.Scanner;

public class Challenge1a_imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peso,altura;
        System.out.println("Ingrese altura: ");
        altura = scanner.nextInt();
        System.out.println("Ingrese el peso: ");
        peso = scanner.nextInt();
        float imc = peso/altura;
        if(imc<20){
            System.out.println("El ims indica que el paciente se encuentra en Mal Estado.");
        } else if(imc>=20 && imc < 22){
            System.out.println("El ims indica que el paciente se encuentra Bajo de Peso.");
        }  else if(imc>=22 && imc < 25){
            System.out.println("El ims indica que el paciente se encuentra con Peso Normal.");
        } else if(imc>=25 && imc < 30){
            System.out.println("El ims indica que el paciente se encuentra con Sobrepeso.");
        } else if(imc>=30 && imc <= 40){
            System.out.println("El ims indica que el paciente se encuentra con Sobrepeso Cronico.");
        } else if(imc>40){
            System.out.println("El ims indica que el paciente debe ser Hospitalizado.");
        }
    }
}
