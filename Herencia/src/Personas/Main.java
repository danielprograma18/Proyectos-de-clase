@import Clases.Persona;
@import Clases.Estudiante;
@import Clases.Profesor;

package personas;
import Clases.*;

public class Main {

public static void main(String[] args) {
    Persona p new Persona();
    p.setNombre("Pepe");
    p.setEdad (25);
    Estudiante e new Estudiante();
    e.setNombre("Juan Jose");
    e.setLegajo (22345);
    e.setCarrera("Sistemas");
    Profesor pro new Profesor();
    pro.setNombre ("Fernando");
    pro.setMateria ("Paradigmas de Programación");
    pro.setCargo ("Adjunto");
    System.out.println("Objeto p de tipo Persona");
    System.out.printf("Nombre:ts, Edad: ad \n", p.getNombre(),p.getEdad());
    System.out.println("Objeto e de tipo Estudiante");
    System.out.printf("Nombre: ts, Carrera:ts, Legajo: &d \n", e.getNombre()
    e.getCarrera(),e.getLegajo());
    System.out.println("Objeto pro de tipo Profesor");
    System.out.printf("Nombre: 3s, Materia:ts, Cargo: %s \n", pro.getNombre () ,pro.getMateria(),pro.getCargo());}
    }
