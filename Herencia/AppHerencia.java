import Clases.*;

public class AppHerencia {
    public static void main(String[]args) thorows Exception{
        Persona p = new Persona();
        p.setNombre("Pepe");
        p.setEdad(25);

        Estudiante e = new Estudiante();
        e.setNombre("Juan Jose");
        e.setCodigo(22345);
        e.setCarrera("Sistemas");

        Profesor pro = new Profesor();
        pro.setNombre("Fernando");
        pro.setMateria("Matematicas");
        pro.getCargo("Instructor")

        System.out.println("Objeto p de tipo Persona");
        System.out.printf("Nombre: %s, Edad %d \n", p.getNombre(), p.getEdad())
        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, carrera %s \n", e.getNombre(), e.getCodigo(), e.getCarrera())
        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, carrera %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo())
   
   }
}