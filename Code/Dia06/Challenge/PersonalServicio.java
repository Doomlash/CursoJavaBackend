package Dia06.Challenge;

public class PersonalServicio extends Empleado{
    private String sector;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return super.toString()+" PersonalServicio [sector=" + sector + "]";
    }

    
}
