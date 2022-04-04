package Challenge_Individual;
import java.util.Scanner;

public class Challenge1c_promedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las 3 notas:");
        float nota1, nota2, nota3;
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();
        float promedio = (nota1 + nota2 + nota3)/3;
        if(promedio<10){
            System.out.println("Promedio = "+String.valueOf(promedio)+" Desaprobado"); 
        } else if(promedio>=10 && promedio<15){
            System.out.println("Promedio = "+String.valueOf(promedio)+" Aprobado");
        } else if(promedio>=15){
            System.out.println("Promedio = "+String.valueOf(promedio)+" Eximido");
        }
    }
}