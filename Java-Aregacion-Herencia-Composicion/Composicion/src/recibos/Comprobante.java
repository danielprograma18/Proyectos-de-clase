package recibos;
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante() { }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha val) {
        this.fecha = val;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int val) {
        this.numero = val;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char val) {
        this.tipo = val;
    }
}

