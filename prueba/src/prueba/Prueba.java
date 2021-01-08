package prueba;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        do{
            System.out.print("Introduce un numero entre 1 y 20: ");
            n=sc.nextInt();
        }while(n<=1 || n>=20);
        for (int fila=1;fila<=n;fila++)
            if (fila%2==1)
            
            {for (int i=((fila-n)/2);i<=-1;i++) System.out.print(" ");
            for (int columna=1;columna<=fila;columna++)
                if (columna==2) {System.out.print("*");}
                else System.out.print(" ");
                System.out.println("*");}
    }
    
}
