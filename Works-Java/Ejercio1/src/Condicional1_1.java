import java.util.Scanner;

public class Condicional1_1 {
    public static void main(String[] args) {
        // Mensaje inicial
        System.out.println("Hello, World!");
        
        // Crear un Scanner para recibir entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar un número entero
        System.out.print("Introduzca Número entero: ");
        int N = sc.nextInt();
        
        // Condicional para verificar si el número es par o impar
        if (N % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        
        // Cerrar el Scanner para evitar fugas de recursos
        sc.close();
    }
}
