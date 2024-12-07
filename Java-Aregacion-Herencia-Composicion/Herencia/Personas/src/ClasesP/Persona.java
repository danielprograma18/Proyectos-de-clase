package ClasesP;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(){

    }

    //asignar valor set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //mostrar o retornar get
    public String getNombre(){
    return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }

}