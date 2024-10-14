import Clases.Fecha;
import Clases.Producto;
import Clases.Cliente;
import Clases.Factura;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public class Main {
        public static void main(String[] args) {
        Fecha hoy = new Fecha(20,10,2011);
        Producto pro1 = new Producto(1, "Cafe", (float) 8.5);
        Producto pro2 = new Producto(2, "Media Luna", 2);
        Cliente cliente = new Cliente(1, "Juana");
        Factura f1 = new Factura('F', 1, hoy, cliente);
        f1.agregarProducto(pro1);
        f1.agregarProducto(pro2);
        f1.mostrar();
        }
        }
    
}
