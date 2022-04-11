package Tests;

public class Clase{
    private static Clase asd;
    private String s;
    private Clase(){
        
    }

    public static Clase getClase() {
        if(asd==null){
            asd = new Clase();
        }
        return asd;
    }

    public String getString(){
        return s;
    }

    public void setString(String s){
        this.s=s;
    }
}