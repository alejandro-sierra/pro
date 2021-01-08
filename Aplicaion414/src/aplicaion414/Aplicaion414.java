package aplicaion414;

import java.util.Scanner;

public class Aplicaion414 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,resultado;
        System.out.print("Numero a: ");a=sc.nextDouble();
        sc.nextLine();
        System.out.print("Numero b: ");b=sc.nextDouble();
        sc.nextLine();
        resultado = a+b;
        if (resultado>0){
            System.out.print("Numero Positivo");
        }else if(resultado==0){
            System.out.print("Numero Nulo");
        }else{
            System.out.println("Numero Negativo");
        }
        System.out.println("");
    }
    
}
