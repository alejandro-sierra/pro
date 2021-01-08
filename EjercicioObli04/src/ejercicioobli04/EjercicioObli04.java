package ejercicioobli04;

/*
---*    
--***   
-***** 
*******
-*****
--*** 
---* 
*/

import java.util.Scanner;

public class EjercicioObli04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número entre el 1 y el 20: ");
            n=sc.nextInt();
        }while (n<1 || n>20 || n%2==0);
            for(int fila=1;fila<=n;fila=fila+2){ //
                for(int blanco=1;blanco<=(n-fila)/2;blanco++){
                    System.out.print(" ");
                }
                for (int asterisco=1;asterisco<=fila;asterisco++){
                            System.out.print("*");
                }
                 System.out.println("");
            }
            for(int fila=1;fila<=n-1;fila++){ //
                for(int blanco=1;blanco<=fila;blanco++){
                    System.out.print(" ");
                }
                int numero_asteriscos = n-2*fila;
                for (int asterisco=1;asterisco<=numero_asteriscos;asterisco++){
                            System.out.print("*");
                }
                 System.out.println("");
            }
    }
    
}
