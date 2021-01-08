package aplicacionalumno1;

import java.util.Scanner;


public class AplicacionAlumno1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //creamos un objeto con el constructor vacio
    Alumno alu1 = new Alumno ();
    alu1.nombre = "Alejandro Ballesta";
    alu1.curso = "1W";
    alu1.edad = 21;
    
        System.out.println("Nombre: " + alu1.nombre);
        System.out.println("Curso: " + alu1.curso);
        System.out.println("Edad: " + alu1.edad);
        System.out.println("");
        
        
    Alumno alu2 = new Alumno ();
        System.out.print("Nombre: "); alu2.nombre = sc.nextLine();
        System.out.print("Curso: "); alu2.curso = sc.nextLine();
        System.out.print("Edad: "); alu2.edad = sc.nextInt();
        System.out.println("");
        
   /* String nombre="pepe";
    String curso;
    int edad;
        System.out.print("Curso: "); curso = sc.nextLine();
        System.out.print("Edad: "); edad = sc.nextInt();
        System.out.println("");
    
    Alumno alu3 = new Alumno (nombre,curso, edad);*/
    
    alu1.Imprimir();
    alu2.Imprimir();
    //alu3.Imprimir();
    System.out.println(alu2.Imprimir2());

        //System.out.println(alu3.Imprimir2());
    
        
    }
    
}
