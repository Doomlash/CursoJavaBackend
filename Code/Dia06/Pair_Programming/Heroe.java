package PairProgramming;

public interface Heroe {
    public abstract String getName();

    public abstract void atacar();

    public abstract void defender();

    public abstract void descansar();

    public abstract void cambiarClase(ClassStrategy c);

}
