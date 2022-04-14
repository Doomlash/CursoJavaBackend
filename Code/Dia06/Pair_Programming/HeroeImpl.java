package Dia06.Pair_Programming;

public class HeroeImpl implements Heroe{
    private int attackDamage;
    private int attackSpeed;
    private int defence;
    private String nombre;
    private ClassStrategy classStrategy;

    public HeroeImpl(int attackDamage, int attackSpeed, int defence, String nombre, ClassStrategy clase) {
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.defence = defence;
        this.nombre = nombre;
        this.classStrategy = clase;
    }

    @Override
    public String getName() {
        return nombre;
    }

    public void atacar(){
        classStrategy.atacar(attackDamage,attackSpeed);
    }

    public void defender(){
        classStrategy.defender(defence);

    }

    public void descansar(){
        classStrategy.descansar();
    }

    @Override
    public void cambiarClase(ClassStrategy c) {
        classStrategy = c;
    }
}