package basicosecuencial01;

//Programa que lea dos numeros enteros por teclado y los muestre por pantalla.

import java.util.Scanner;


public class Basicosecuencia01 {
    
    public static void main(String[] args) {
            //declaracion de variantes
        int n1, n2;
        Scanner sc = new Scanner (System.in);
            //leer el primer numero
        System.out.print("Introduce un numero entero: ");
        n1 = sc.nextInt();      //lee un numero entero por teclado
            //leer el segundo numero
        System.out.print("Introduce otro un numero entero: ");
        n2 = sc.nextInt();     //lee un numero por teclado
        //mostrar resultados
        System.out.println("Ha introducido los nuemros: " + n1 + " y " + n2);
         
    }
    
}
