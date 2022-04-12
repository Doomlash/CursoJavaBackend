package Dia05.Pair_Programming;

public class Mozo extends Empleado {

    public Mozo(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String presentarse(){
        return "Buenas noches. Soy "+nombre+" y voy a ser su mozo por hoy. Que desea pedir del menu?";
    }

    public String tomarPedido(String pedido){
        return "Entendido. Su "+pedido+" estara listo pronto.";
    }

    public String entregarPedido(String pedido){
        return "Aqui esta su "+pedido+". Buen provecho.";
    }

    @Override
    public String info() {
        return "Nombre = "+nombre+" "+apellido+". Puesto = Mozo";
    }
}
