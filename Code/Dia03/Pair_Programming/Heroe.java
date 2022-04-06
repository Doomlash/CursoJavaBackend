package Dia03.Pair_Programming;

public class Heroe{
    private String attackType;
    private int attackDamage;
    private boolean alive;
    private int status;
    private String statusName;

    public Heroe(){
        attackType = "Fisico";
        attackDamage = 6;
        alive = true;
    }

    public void inflictStatus(String string, int turns) {
        statusName = string;
        status = turns;
    }

    public void passTurn(){
        if(status>0){
            status--;
        }
    }

    public String getStatus(){
        return statusName;
    }

    public String getAttackType() {
        return attackType;
    }

    public boolean isAlive(){
        return alive;
    }

    public int getDamage(){
        return attackDamage;
    }

}
