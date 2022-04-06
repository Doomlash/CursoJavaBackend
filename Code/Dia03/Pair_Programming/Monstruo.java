package Dia03.Pair_Programming;

public abstract class Monstruo {
    protected int health;
    protected int speed;
    protected String attackType;
    protected int attackDamage;
    protected boolean alive;

    public int getSpeed(){
        return speed;
    }

    public String getAttackType() {
        return attackType;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive(){
        return alive;
    }

    public void recieveDamage(String damageType, int damage){
        health-=damage;
        if(health<0){
            alive = false;
        }
    }


    public abstract void specialAbility(Heroe h);
}
