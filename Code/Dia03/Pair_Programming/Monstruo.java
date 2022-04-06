package Dia03.Pair_Programming;

public abstract class Monstruo {
    protected int health;
    protected boolean alive;
    protected String name;

    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive(){
        return alive;
    }

    public int recieveDamage(String damageType, int damage){
        health-=damage;
        if(health<0){
            alive = false;
        }
        return damage;
    }


    public abstract void specialAbility(Heroe h);
}
