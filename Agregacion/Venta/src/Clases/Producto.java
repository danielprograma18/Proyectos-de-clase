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
        public void setCodigo (int val) {
            this.codigo = val;
        }
    public String getDescripcion () {
        return descripcion;
    }
        public void setDescripcion (String  val) {
            this.descripcion = val;
        }
    public float getPrecio () {
        return precio;
    }
        public void setPrecio (float val) {
            this.precio = val;
        }

        public Producto(int c, String d, float p){
            setCodigo(c);
            setDescripcion(d);
            setPrecio(p);
            }
            
    
}
