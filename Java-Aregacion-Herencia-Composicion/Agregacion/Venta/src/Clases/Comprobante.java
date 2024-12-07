package Clases;

public class Comprobante {

    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante (){
    }

    public Fecha getFecha (){
        return fecha;
    }

        public void setFecha (Fecha fecha) {
            this.fecha = fecha;
        }
        
    public int getNumero () {
        return numero;
    }
        public void setNumero (int numero) {
            this.numero = numero;
        }
    public char getTipo () {
        return tipo;
    }
        public void setTipo (char tipo) {
            this.tipo = tipo;
        }
        
        public Comprobante(char t, int n, Fecha f){
            setTipo(t);
            setNumero(n);
            setFecha(f);
            }
}
