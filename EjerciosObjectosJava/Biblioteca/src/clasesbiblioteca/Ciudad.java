package clasesbiblioteca;

public class Ciudad extends General {
    private Pais pais;

    // Constructor vacío
    public Ciudad() {
    }

    // Constructor con parámetros
    public Ciudad(int codigo, String nombre, Pais pais) {
        super(codigo, nombre);  // Llama al constructor de la clase General
        this.pais = pais;
    }

    // Métodos setters y getters
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "Código: " + getCodigo() + ", Nombre: " + getNombre() + ", País: " + pais + '}';
    }
}

