package aplicaion4223;

import java.util.Scanner;

public class Aplicaion4223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Numero de filas: ");n=sc.nextInt();
            for (int fila=3;fila<n+3;fila++){
                for (int columna=fila;columna<=fila+8;columna+=2){ //columna+=2 == columna = columna+2
                    System.out.print(columna+" ");
                }
                System.out.println("");
            }
    }
    
}
