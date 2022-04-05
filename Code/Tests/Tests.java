package Tests;

public class Tests {
    
    public static void main(String[] args) {
        int n[] = {3,5,1,10,9,6};
    
        for(int i=0;i<n.length;i++){
            for (int j = 0; j < n.length; j++) {
                if(n[i]<n[j]){
                    int temp = n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
                for (int x : n) {
                    System.out.print(String.valueOf(x)+" ");
                }
                System.out.println();
            }
            System.out.println("-----------------------");
            for (int x : n) {
                System.out.print(String.valueOf(x)+" ");
            }
            System.out.println();
        }
        for (int x : n) {
            System.out.println(String.valueOf(x)+" ");
        }
    }
}
