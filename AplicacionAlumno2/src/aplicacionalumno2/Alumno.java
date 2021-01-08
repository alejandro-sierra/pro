package aplicacionalumno2;

public class Alumno {
private String nombre; //encapsulando propiedades, con private
private String curso;
//en vez de ser un int podria ser un byte, ya que byte llega hasta 127.
private int edad;
private static int contadorAlumnos;
//contructor vacio
public Alumno() {
this.contadorAlumnos++;
}
    
    public Alumno(String nombre, String curso, int edad) {
    this.nombre = nombre;
    this.curso = curso;
    this.edad = edad;
         
    }
        
public void Imprimir() {
        System.out.println("Nombre:" + getNombre());
        System.out.println("Curso: " + getCurso()); 
        System.out.println("Edad: "+ getEdad()); 
        System.out.println("");
        
}

public String Imprimir2() {
    String s;
    s="Nombre:" + this.getNombre() + "Curso:" + this.getCurso() + "Edad: " + this.getEdad();
    return s;
}

/*public String leeNombre(){
    return this.nombre;
}
public void grabaNombre (String nombre){
    this.nombre = nombre;
}*/

//para hacer esto le das a la clase/Refactor/Encapsulate Filds
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    //get y set Contador de Alumnos
    public static int getContadorAlumnos() {
        return contadorAlumnos;
    }
    public static void setContadorAlumnos(int aContadorAlumnos) {
        contadorAlumnos = aContadorAlumnos;
    }
    
    
/*@Override
public String toString ();
return*/
 
    
    

}
