package Dia04.Challenge;

public class VehiculoCarga extends Vehiculo {
    Remolque remolque;
    public VehiculoCarga(String matricula) {
        super(matricula);
        //TODO Auto-generated constructor stub
    }

    public void ponRemolque(Remolque remolque){
        this.remolque = remolque;
    }
    
    public void quitaRemolque(){
        remolque = null;
    }

    public void accelerate(int speed){
        if(remolque!=null&&this.getSpeed()+speed>100){
            //throw new DemasiadoRapidoException("asd");
        }
        super.accelerate(speed);
    }

    @Override
    public String toString() {
        String s = super.toString();
        if(remolque!=null){
            s = s+remolque.toString();
        }
        return s;
    }
}
