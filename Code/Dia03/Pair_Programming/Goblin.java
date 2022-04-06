package Dia03.Pair_Programming;

public class Goblin extends Monstruo{

    public Goblin(){
        health = 10;
        alive = true;
        name = "Goblin";
    }

    @Override
    public void specialAbility(Heroe h) {
        h.inflictStatus("poison", 3);
    }

}
