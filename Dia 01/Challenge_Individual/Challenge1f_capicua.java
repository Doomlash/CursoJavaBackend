package Challenge_Individual;
import java.util.Scanner;

public class Challenge1f_capicua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n = scanner.nextInt();
        int aux = n;
        int inverso = 0;
        while(aux != 0){
            inverso *= 10;
            inverso += aux % 10;
            aux /= 10;
        }
        if(n == inverso){
            System.out.println("es capicua");
        }
        else{
            System.out.println("no es capicua");
        }
    }
}