package Dia01.Pair_Programing;
/**
 * MainAscensor
 */
public class MainAscensor {

    public static void main(String[] args) {
        Ascensor a = new Ascensor(7, 4);
        a.subirPisos(2);
        if(a.subirPisos(2)){
            System.out.println("El ascensor subio 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        } else {
            System.out.println("El ascensor no puede subir 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        }

        if(a.subirPisos(2)){
            System.out.println("El ascensor subio 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        } else {
            System.out.println("El ascensor no puede subir 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        }

        if(a.subirPisos(2)){
            System.out.println("El ascensor subio 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        } else {
            System.out.println("El ascensor no puede subir 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        }

        if(a.subirPisos(2)){
            System.out.println("El ascensor subio 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        } else {
            System.out.println("El ascensor no puede subir 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        }
        
        if(a.subirPisos(2)){
            System.out.println("El ascensor subio 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        } else {
            System.out.println("El ascensor no puede subir 2 pisos. Se encuentra en el piso "+String.valueOf(a.getPiso()));
        }
    }
    
}