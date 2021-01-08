package ejercicioobli01;

    /*
    1º. Realiza un programa que te pida por teclado un número entero comprendido
    entre 1 y 20 y que, utilizando estructuras de control, imprima por pantalla el 
    siguiente resultado:
    Para n = 7 imprimirá 
    * 
    ** 
    *** 
    **** 
    ***** 
    ****** 
    *******
    */

import java.util.Scanner;

public class EjercicioObli01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número entre el 1 y el 20: ");
            n=sc.nextInt();
        }while (n<1 || n>20);
            for(int fila = 1; fila<=n; fila++){
                for(int columna = 1; columna<=fila;columna++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            
    }
    
}
