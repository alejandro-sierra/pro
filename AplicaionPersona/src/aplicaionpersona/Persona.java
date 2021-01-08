
package aplicaionpersona;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String dni;
    private int edad;
    private static int contador;
    
    //contructor vacio
public Persona () {
this.contador++;
}

public Persona (String nombre, String dni, int edad){
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad; 
    this.contador++;
}




//contructor copia
public Persona (Persona p) {
    this.nombre = p.nombre;
    this.dni = p.dni;
    this.edad = p.edad;
    
}
//metodo que copia los valores de un objeto a otro ambos existen
//copia los datos de this en p
public void Copia (Persona p) {
    p.nombre = this.nombre;
    p.dni = this.dni;
    p.edad = this.edad;
}
//copia los datos de p a this
public void Copia2 (Persona p) {
    this.nombre = p.nombre;
    this.dni = p.dni;
    this.edad = p.edad;
}

   /* @Override
    public boolean equals(Object o) {
        boolean correcto;
        return correcto=true;
    Persona
}*/


//metodo para imprimir objetos
    @Override
    public String toString(){
    String resultado;
    resultado = "\nnombre" + this.nombre+
                "\ndni" + this.dni+
                "\nedad" + this.edad +
                "\nNumero de personas: " + contador;
    return resultado;
} 
//metodo para pedir datos
public void pideDatos (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nombre: "); this.nombre = sc.nextLine();
        System.out.print("DNI: "); this.dni = sc.nextLine();
        System.out.print("Edad: "); this.edad = sc.nextInt();
        System.out.println("");
}



//sets y gets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
}