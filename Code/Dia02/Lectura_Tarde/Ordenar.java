package Dia02.Lectura_Tarde;

public class Ordenar{
    public static void main(String[] args) {
        String[] a = {"coder", "devplace", "personas", "curso", "alumnado"};
        int limit = 1;
        boolean ubicado = false;
        for(int i=0;i<a.length;i++){
            while(!ubicado){
                if(a[i]<a[i-1]){
                    String temp = a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                } else {
                    ubicado = true;
                }
            }
            ubicado = false;
        }
    }
}