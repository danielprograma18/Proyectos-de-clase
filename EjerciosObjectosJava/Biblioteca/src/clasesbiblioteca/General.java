package clasesbiblioteca;

public class General {

    private int codigo;
    private String nombre;

    public General(){


    }

    public General(int cod, String nom){
        this.codigo = cod;
        this.nombre = nom;

    }

    public void setCodigo(int cod){
        this.codigo = cod;


    }

    public void setNombre (String nom){
        this.nombre = nom;
    }

    public int getCodigo(){

        return codigo;
    }
    public String getNombre(){
return nombre;

    }

    public boolean validarDatos () {
        return true;

    }

    public String toString(){
        return "General {" + codigo + ", nombre " + nombre + "}";
    }


}
