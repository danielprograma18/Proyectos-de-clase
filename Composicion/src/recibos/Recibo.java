package recibos;
public class Recibo extends Comprobante {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo(int dia, int mes, int anio, String razonSocial, int numero) {
        super();
        this.setFecha(new Fecha());
        this.getFecha().setDia(dia);
        this.getFecha().setMes(mes);
        this.getFecha().setAnio(anio);
        this.setProveedor(new Proveedor());
        this.getProveedor().setRazonSocial(razonSocial);
        this.setNumero(numero);
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String val) {
        this.detalle = val;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor val) {
        this.proveedor = val;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float val) {
        this.total = val;
    }

    public void mostrar() {
        System.out.println("Recibo: ");
        System.out.println("Fecha: " + this.getFecha().getDia() + "/" + this.getFecha().getMes() + "/" + this.getFecha().getAnio());
        System.out.println("Proveedor: " + this.getProveedor().getRazonSocial());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Detalle: " + this.getDetalle());
        System.out.println("Total: " + this.getTotal());
    }
}
