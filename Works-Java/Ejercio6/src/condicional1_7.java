import java.io.*;

public class condicional1_7 {
    public static void main(String[] args) throws IOException {
        char car1;
        System.out.print("Introduzca carácter: ");
        //lee caracter 
        car1 = (char) System.in.read(); 
        if (Character.isDigit(car1)) 
            System.out.println("Es un número");
        else
            System.out.println("No es un número");
    }
}
