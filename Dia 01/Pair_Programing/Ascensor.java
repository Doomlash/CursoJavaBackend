package Pair_Programing;

/*
*crear una clase que modele un ascensor, con el rango de pisos y de personas que puede tener. 
*brindar metodos para subir y bajar el ascensor una cierta cantidad de pisos y para cargar y descargar personas.
*/
public class Ascensor {
    int pisoActual, personas, pisoMaximo, capacidadMaxima;

    public Ascensor(int pisoMaximo, int capacidadMaxima){
        this.pisoMaximo = pisoMaximo;
        this.capacidadMaxima = capacidadMaxima;
        pisoActual = 0;
        personas = 0;
    }

    public boolean cargarPersonas(int n){
        if((personas+n)>capacidadMaxima){
            return false;
        }
        else{
            personas+=n;
            return true;
        }
    }

    public boolean descargarPersonas(int n){
        if((personas-n)<0){
            return false;
        }else{
            personas-=n;
            return true;
        }
    }

    public boolean subirPisos(int n){
        if((pisoActual+n)>pisoMaximo){
            return false;
        } else {
            pisoActual+=n;
            return true;
        }
    }
    public boolean bajarPisos(int n){
        if((pisoActual-n)>0){
            return false;
        } else {
            pisoActual-=n;
            return true;
        }
    }


}
