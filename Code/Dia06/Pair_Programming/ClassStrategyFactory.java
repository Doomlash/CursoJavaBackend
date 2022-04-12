package PairProgramming;

public class ClassStrategyFactory {
    public ClassStrategy createClassStrategy(int opcion){
        switch(opcion){
            case 1:
                return new Guerrero();
            case 2:
                return new Mago();
            case 3:
                return new Cazador();
            default:
                return null;
        }
    }
}
