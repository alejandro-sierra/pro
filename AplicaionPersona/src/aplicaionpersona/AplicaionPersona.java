package aplicaionpersona;

import java.util.Scanner;

public class AplicaionPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre, dni;
        int edad;
        Persona per1 = new Persona();
        per1.pideDatos();
     /*   System.out.print("Nombre: "); nombre = sc.nextLine();
        per1.setNombre(nombre);
        System.out.print("DNI: "); dni = sc.nextLine();
        per1.setDni(dni);
        System.out.print("Edad: "); edad = sc.nextInt();
        per1.setEdad(edad);
        sc.nextInt ();*/
     
    
             

        
//llamando a un metodo vacio
Persona per2 = new Persona ();
per2.pideDatos();
per2.toString();

//contructor copia vamos a meter los datos de per2 en per3
Persona per3 = new Persona (per2);
//queremos meter los datos de per1 en per2
//per1.Copia(per2);
//queremos meter los datos de per2 en per1
//per2.Copia2(per1);

//Persona.Copia3(per1,per2); //mirar preguntar esto

 //equals
     /*if(per1.equals(o) ==true) {
         System.out.println("Misma contenido");
     }
     else{
         System.out.println("Distinto contenido");
     }*/
    }

    
    
}
