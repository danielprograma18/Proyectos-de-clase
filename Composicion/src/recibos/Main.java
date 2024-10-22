package recibos;

public class Main {
    public static void main(String[] args) {
        Recibo recibo = new Recibo(27, 10, 2011, "Limpituc SA", 2023);
        recibo.setTipo('R');
        recibo.setNumero(1);
        recibo.setDetalle("Pago de servicio jardinería");
        recibo.setTotal(350);
        recibo.mostrar();
    }
}

