package basicosecuencial02;

//Programa java que lea un nombre y muestre por pantalla: "Buenos dias nombre_introducido"

import java.util.Scanner;

public class Basicosecuencial02 {
   
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
    String cadena;
    System.out.print("Introduce un nombre: ");
    cadena = sc.nextLine();
    System.out.println("Buenos Dias " +cadena);
    
    }
    
}
