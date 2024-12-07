package recibos;
public class Proveedor {
    private int codigo;
    private String razonSocial;

    public Proveedor() { }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int val) {
        this.codigo = val;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String val) {
        this.razonSocial = val;
    }
}
