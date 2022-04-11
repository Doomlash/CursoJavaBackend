package Tests;

public class Tests {
    public static void main(String[] args) {
        Clase x = Clase.getClase();
        Clase y = Clase.getClase();

        x.setString("asd");
        y.setString("zxc");

        System.out.println(x.getString());
        System.out.println(y.getString());
    }
}
