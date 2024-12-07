import clasesbiblioteca.*;
import java.util.Scanner;

public class AppBiblioteca {
    private Libro libro;

    public static void main(String[] args) throws Exception {
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarLibro();
        appBiblioteca.imprimir();
    }

    // Método para cargar datos del libro desde la consola
    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();

        System.out.println("Digite el código del libro:");
        libro.setCodigo(sc.nextInt());  // Asignar código al libro

        System.out.println("Digite el nombre del libro:");
        libro.setNombre(sc.next());  // Asignar nombre al libro

        System.out.println("Digite el año de publicación:");
        libro.setAñoPublicacion(sc.nextInt());  // Asignar año de publicación

        System.out.println("Digite la edición:");
        libro.setEdicion(sc.nextInt());  // Asignar edición

        // Datos del autor
        Autor autor = new Autor();
        System.out.println("Digite el código del autor del libro:");
        autor.setCodigo(sc.nextInt());  // Asignar código al autor

        System.out.println("Digite el nombre del autor del libro:");
        autor.setNombre(sc.next());  // Asignar nombre al autor

        libro.setAutor(autor);  // Asignar el autor al libro

        sc.close();  // Cerrar el Scanner
    }

    // Método para imprimir la información del libro
    public void imprimir() {
        System.out.println(libro);  // Imprimir los detalles del libro
    }
}


/*import clasesbiblioteca.*;
import java.util.Scanner;

public class AppBiblioteca {
    private Libro libro;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarLibro();
        appBiblioteca.imprimir();
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Digite el código del libro:");
        libro.setNombre(sc.nextInt());
        System.out.println("Digite el nombre del libro:");
        libro.setAñopublicacion(sc.nextInt()); 
        System.out.println("Digite el año de publicacion");
        libro.añoPublicacion(sc.nestInt());
        System.out.println("Digite la edicion");
        libro.setEdicion(sc.nextInt());  // Corrección aquí

        Autor autor = new Autor();
        System.out.println("Digite el codigo del autor del libro: ");
        autor.setCodigo(sc.nextInt());
        System.out.println("Digite el nombre del autor del libro: ");
        autor.setNombre(sc.next());
        libro.setAutor(autor);
        sc.close();
    }

    public void imprimir() {
        System.out.println(libro);
    }
} */


