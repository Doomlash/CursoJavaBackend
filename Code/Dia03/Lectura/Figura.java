package Dia03.Lectura;

public abstract class Figura {
    private String name;
    
    public abstract double getPerimetro();

    protected void setName(String name){
        this.name = name; 
    }

    public String getName(){
        return name;
    }
}
