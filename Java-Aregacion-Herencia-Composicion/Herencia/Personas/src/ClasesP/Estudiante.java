package ClasesP;
public class Estudiante extends Persona{
    private String carrera;
    private int legajo;
    
    public Estudiante(){

    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public String getCarrera(){
        return carrera;
    } 

    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public int getLegajo(){
        return legajo;
    }
}
