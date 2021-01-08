package aplicacionalumno1;

public class Alumno {
String nombre;
String curso;
//en vez de ser un int podria ser un byte, ya que byte llega hasta 127.
int edad;
//contructor vacio
public Alumno() {} //esto es un metodo
    
    public Alumno(String nombre, String curso, int edad) {
    this.nombre = nombre;
    this.curso = curso;
    this.edad = edad;
         
    }
        
public void Imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Curso: " + curso); 
        System.out.println("Edad: "+ edad); 
        System.out.println("");
        
}

public String Imprimir2() {
    String s;
    s="\nNombre:" + this.nombre + "\nCurso:" + this.curso + "\nEdad: " + this.edad;
    return s;
        
}




}
