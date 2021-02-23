package herencia01;

import java.util.ArrayList;
import java.util.Scanner;

public class Herencia01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        ArrayList<Persona> lista = new ArrayList<Persona>();
        Persona o; //esto se suele hacer en una linea Persona o = new Profesor();
        //01
        o = new Profesor();
        o.pideDatos();
        lista.add(o);
        System.out.println("");

        o = new Alumno();
        o.pideDatos();
        lista.add(o);
        System.out.println("");

//        //02
//        o = new Profesor();
//        o.pideDatos();
//        lista.add(o);
//        System.out.println("");
//        
//        o = new Alumno();
//        o.pideDatos();
//        lista.add(o);
//        System.out.println("");


        System.out.println("Listado de Personas");
        for (Persona valor : lista) {
            System.out.println(valor.toString());
        }

        System.out.println("");
        System.out.println("Listado de Alumnos");
        for (Persona valor : lista) {
            if (valor instanceof Alumno) {
                System.out.println(valor.toString());
            }
        }

        System.out.println("");
        System.out.println("Listado de Profesor");
        for (Persona valor : lista) {
            if (valor instanceof Profesor) {
                System.out.println(valor.toString());
            }
        }

        System.out.println("");
        System.out.print("Curso a listar : ");
        cadena = sc.nextLine();
        System.out.println("Lista Alumnos del curso: " + cadena);
        for (Persona valor : lista) {
            if (valor instanceof Alumno) {
                Alumno a = (Alumno) valor;
                if (a.getCurso().compareTo(cadena) == 0) {
                    System.out.println(valor.getNombre());
                }
            }
        }

    }

}
