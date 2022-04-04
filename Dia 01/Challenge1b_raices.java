import java.util.Scanner;

public class Challenge1b_raices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese a,b y c");
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int discriminante = (int)Math.pow(b, 2)-4*a*c;
        if(discriminante>0){
            System.out.println("Tiene raices distintas");
        } else if(discriminante==0){
            System.out.println("Tiene raices iguales");
        } else if(discriminante<0){
            System.out.println("Tiene raices imaginarias");
        }
    }
}
