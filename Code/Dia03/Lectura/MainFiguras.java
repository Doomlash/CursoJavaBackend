package Dia03.Lectura;

public class MainFiguras {
    public static void main(String[] args) {
        Figura[] array = new Figura[4];
        array[0] = new Triangulo(3, 4, 5);
        array[1] = new Cuadrilatero(6, 5, 3, 1);
        array[2] = new Cuadrado(5);
        array[3] = new Rectangulo(3, 5);
        for (Figura figura : array) {
            System.out.println("Soy un "+ figura.getName()+" y mi perimetro es "+String.valueOf(figura.getPerimetro()));
        }
    }
}
