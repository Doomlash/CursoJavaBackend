import java.util.Scanner;

public class Challenge1e_menor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:");
        int n[] = new int[3];
        n[0]=scanner.nextInt();
        n[1]=scanner.nextInt();
        n[2]=scanner.nextInt();
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if((Integer.compare(menor, n[i]))>0){
                menor = n[i];
            }
        }
        System.out.println("menor = "+String.valueOf(menor));
        
    }
}
