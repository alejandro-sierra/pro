package conversion;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad +1));
        
        var valorPi= Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //pedir un valor
//        var consola = new Scanner(System.in);
//        System.out.print("Proporciona tu edad: ");
//        edad = Integer.parseInt( consola.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.print("Proporciona un caracter: ");
        caracter=sc.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
