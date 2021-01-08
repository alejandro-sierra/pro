package iguales;

import java.util.Scanner;

public class Iguales {

    public static void main(String[] args) {
//la clase String utiliza el metodo equals para saber si el contenido de dos cadenas es el msimo.
    Scanner sc = new Scanner(System.in);
        String cadena1, cadena2;
        System.out.print("Cadena 1: "); cadena1 = sc.nextLine();
        System.out.print("Cadena 2: "); cadena2 = sc.nextLine();
        boolean correcto;
        correcto = cadena1.equals(cadena2);
            //System.out.println("Iguales " + correcto);
        if (cadena1.equals(cadena2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferente");
        }
    }
    
    
}
