import ClasesP.*;

public class AppGeneralizacion {
    public static void main(String[] args) {
        // Instanciar la clase persona
        Persona p = new Persona();
        p.setNombre("Pepe");
        p.setEdad(25);

        // Instanciar la clase Estudiante
        Estudiante e = new Estudiante();
        e.setNombre("Juan Jose");
        e.setLegajo(22345);
        e.setCarrera("Sistemas");

        // Instanciar la clase Profesor
        Profesor pro = new Profesor();
        pro.setNombre("Fernando");
        pro.setMateria("Paradigmas de Programación");
        pro.setCargo("Adjunto");

        // Imprimir datos
        System.out.println("Objeto p de tipo persona");
        System.out.printf("Nombre: %s, Edad: %d \n", p.getNombre(), p.getEdad());
        
        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, Carrera: %s, Legajo: %d \n", e.getNombre(), e.getCarrera(), e.getLegajo());
        
        System.out.println("Objeto pro de tipo Profesor");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo());
    }
}