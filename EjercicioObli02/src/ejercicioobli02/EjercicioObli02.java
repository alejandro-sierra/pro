package ejercicioobli02;

import java.util.Scanner;

/*
------*
-----*-*
----*-*-*       blanco + fila = n
---*-*-*-*
--*-*-*-*-*
-*-*-*-*-*-*
*-*-*-*-*-*-*

blanco     asterisco   n = 5
  4           1
  3           2
  2           3
  1           4
  0           5
*/

public class EjercicioObli02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número entre el 1 y el 20: ");
            n=sc.nextInt();
        }while (n<1 || n>20);
            for(int fila=1;fila<=n;fila++){
                for(int blanco=1;blanco<=n-fila;blanco++){
                    System.out.print(" ");
                }
                for (int asterisco=1;asterisco<=fila;asterisco++){
                            System.out.print("* ");
                }
                 System.out.println("");
            //System.out.println("fila");
            }
           
        }
        
    }
    

