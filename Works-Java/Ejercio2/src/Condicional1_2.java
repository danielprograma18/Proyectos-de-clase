import java.util.Scanner;

public class Condicional1_2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Crear un Scanner para recibir entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Aqui empieza a leer
        int N;
        System.out.print("Número entero: ");
        N = sc.nextInt();
        // si el nuemro es en el rango de 10 es multiplo de 10 y si no es multiplo de 10
        // es pq es menor q el numero indicado
        if (N % 10 == 0)
            System.out.println("Es múltiplo de 10");
        else
            System.out.println("No es múltiplo de 10");


            //cerar
        sc.close();
    }
}
