package Challenge_Individual;
import java.util.Scanner;

public class Challenge1d_mayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:");
        int n[] = new int[3];
        n[0]=scanner.nextInt();
        n[1]=scanner.nextInt();
        n[2]=scanner.nextInt();
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if((Integer.compare(mayor, n[i]))<0){
                mayor = n[i];
            }
        }
        System.out.println("mayor = "+String.valueOf(mayor));
        
    }
}