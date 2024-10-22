import java.util.Scanner;

public class condicional1_16 {
    public static void main(String[] args) {
        int H, M, S;
        Scanner sc = new Scanner(System.in);
        //Empieza a ingresar los nuemros validos 
        System.out.print("Introduzca hora: ");
        H = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S = sc.nextInt();
        //aqui se coloca la hora los minutos y segundos 
        if (H >= 0 && H < 24 && M >= 0 && M < 60 && S >= 0 && S < 60){
            //si la hora es correcta 
            System.out.println("Hora correcta");
        }else{
            //sino puede ser incorrecta
            System.out.println("Hora incorrecta");
        }

        //cerar 
        sc.close();
    }
}