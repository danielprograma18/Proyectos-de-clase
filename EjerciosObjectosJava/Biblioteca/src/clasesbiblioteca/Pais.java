package clasesbiblioteca;

public class Pais extends General {
    private String region;  // Por ejemplo, continente o región del país

    // Constructor vacío
    public Pais() {
    }

    // Constructor con parámetros
    public Pais(int codigo, String nombre, String region) {
        super(codigo, nombre);  // Llama al constructor de la clase General
        this.region = region;
    }

    // Métodos setters y getters
    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Pais{" + "Código: " + getCodigo() + ", Nombre: " + getNombre() + ", Región: " + region + '}';
    }
}
