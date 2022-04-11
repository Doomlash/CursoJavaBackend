package Dia06.Challenge;

public class Estudiante extends Persona{
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+" Estudiante [curso=" + curso + "]";
    }

    
}
