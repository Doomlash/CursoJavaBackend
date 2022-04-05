package Dia01.Lectura_Tarde;

import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
        System.out.println("ingrese medidas:");
        Scanner scanner = new Scanner(System.in);
        Triangulo t = new Triangulo(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.println(t.tipoDeTriangulo());
    }
}
