package Clases;

public class Producto {

    private int codigo;
    private String descripcion;
    private float precio;

    public Producto (){

    }
    public int getCodigo () {
        return codigo;
    }
        public void setCodigo (int codigo) {
            this.codigo = codigo;
        }
    public String getDescripcion () {
        return descripcion;
    }
        public void setDescripcion (String  descripcion) {
            this.descripcion = descripcion;
        }
    public float getPrecio () {
        return precio;
    }
        public void setPrecio (float precio) {
            this.precio = precio;
        }

        public Producto(int c, String d, float p){
            setCodigo(c);
            setDescripcion(d);
            setPrecio(p);
            }
            
    
}
