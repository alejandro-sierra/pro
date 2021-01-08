package aplicacionalumno2;

import java.util.Scanner;


public class AplicacionAlumno2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //creamos un objeto con el constructor vacio
    Alumno alu1 = new Alumno ();
    alu1.setNombre("Alejandro Ballesta");
    alu1.setCurso("1W");
    alu1.setEdad(21);
    
        System.out.println("Nombre: " + alu1.getNombre());
        System.out.println("Curso: " + alu1.getCurso());
        System.out.println("Edad: " + alu1.getEdad());
        
        
    Alumno alu2 = new Alumno ();
        System.out.print("Nombre: "); alu2.setNombre(sc.nextLine());
        System.out.print("Curso: "); alu2.setCurso(sc.nextLine());
        System.out.print("Edad: "); alu2.setEdad(sc.nextInt());
        System.out.println("");
    String nombre, curso;
    int edad;
        System.out.print("Nombre: "); nombre = sc.nextLine();
        //aqui esta el problema
        System.out.print("Curso: "); curso = sc.nextLine();
        System.out.print("Edad: "); edad = sc.nextInt();
    
    Alumno alu3 = new Alumno (nombre, curso, edad);
    
    alu1.Imprimir();
    alu2.Imprimir();
    alu3.Imprimir();

        System.out.println(alu3.Imprimir2());
        System.out.println(alu3.toString());
        
        System.out.println("Tenermos matriculado a: " + Alumno.getContadorAlumnos());

        
    }
    
}
