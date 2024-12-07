import java.util.Scanner;

public class condicional1_3 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Crear un Scanner para recibir entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer un carácter
        System.out.print("Indrodusca una letra: ");
        char car = sc.next().charAt(0);  // Leer el primer carácter de la entrada

        // Verificar si es una letra mayúscula
        if (Character.isUpperCase(car)) {  // Usar el método isUpperCase de la clase Character
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }

        // Cerrar el Scanner
        sc.close();
    }
}
