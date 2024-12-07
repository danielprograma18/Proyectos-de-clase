package clasesbiblioteca;

public class Autor extends General {
    private String observacion;
    private int librosPublicados;
    private Pais pais;

    public Autor() {
    }

    public Autor(int cod, String nom, String observacion, int librosPublicados, Pais pais) {
        super(cod, nom);
        this.observacion = observacion;
        this.librosPublicados = librosPublicados;
        this.pais = pais;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setLibrosPublicados(int librosPublicados) {
        this.librosPublicados = librosPublicados;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getLibrosPublicados() {
        return librosPublicados;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Autor{" + "Observación: " + observacion + ", Libros Publicados: " + librosPublicados + ", País: " + pais + super.toString() + '}';
    }
}

/*package clasesbiblioteca;

public class Autor extends General {
    private String observacion;
    private int librosPublicados;
    private Pais pais;

    public Autor(){


    }

    public Autor(int cod, String nom, String observacion, int librosPublicados, Pais pais){
        super(cod, nom);
        this.observacion = observacion;
        this.librosPublicados = librosPublicados;
        this.pais = pais;
    }

    public void setObservacion(String observacion){
        this.observacion = observacion; 
    }
    public void setLibrosPublicados(int librosPublicados){
        this.librosPublicados = librosPublicados;


    }

    public void setPais (Pais pais){

        this.pais = pais;
    }
    public String getObservacion(){
        return observacion;

    }
    public int getLibrosPublicados(){

        return librosPublicados;
    }

    public Pais getPais(){

        return pais;
    }
    public String toString(){
        return "Autor{"+" observacion " + observacion + ", libros publicados " + librosPublicados + ", pais " + pais + super.toString() + '}';}
    }

}
*/