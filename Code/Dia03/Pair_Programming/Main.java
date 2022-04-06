package Dia03.Pair_Programming;

import java.util.Scanner;

public class Main{
    
    public static  void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Pila<Users> pila = new PilaImpList<Users>();
        boolean getOut = false;
        int opc;
        String name, lastName, email, password;

        while(!getOut){
            Users user;
         
            System.out.println("1- Add an user");
            System.out.println("2- Deletes last user");
            System.out.println("3- Show last user");
            System.out.println("4- Exit");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    sc.nextLine();  
                    System.out.println("Write user's name");
                    name = sc.nextLine();

                    sc.nextLine();  
                    System.out.println("Write user's last name");
                    lastName = sc.nextLine();

                    sc.nextLine();  
                    System.out.println("Write user's email");
                    email = sc.nextLine();

                    sc.nextLine();  
                    System.out.println("Write user's password");
                    password = sc.nextLine();

                    user = new Users(name, lastName, email, password);
                    pila.push(user);
                    break;
                case 2:
                    System.out.println(pila.pop().toString());
                    break;
                case 3: 
                    System.out.println(pila.peek().toString());
                    break;
                case 4:
                    System.out.println("Good bye");
                    getOut = true;
                    break;
                default: 
                    System.out.println("Insert a valid option");
                    break;
            }
        }
    }

    
}