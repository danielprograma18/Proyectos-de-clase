import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer carácter
        System.out.print("Introduzca primer carácter: ");
        char car1 = sc.next().charAt(0); 

        // Leer carácter
        System.out.print("Introduzca segundo carácter: ");
        char car2 = sc.next().charAt(0); 

        // Comparar 
        if (car1 == car2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        // Cerrar 
        sc.close();
    }
}
