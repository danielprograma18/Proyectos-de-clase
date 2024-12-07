import java.util.Scanner;

public class Condicional1_88{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo, divisor;
        
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextDouble();
        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextDouble();
        
        if (divisor == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            // Mostrar el resultado con dos decimales
            System.out.printf("%.2f / %.2f = %.2f %n", dividendo, divisor, dividendo / divisor);
        }

        // Cerrar el Scanner
        sc.close();
    }
}
