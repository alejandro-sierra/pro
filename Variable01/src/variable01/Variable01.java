package variable01;

import java.util.Scanner;

public class Variable01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        String c;
        System.out.print("Introduce entero: ");
        a = sc.nextInt();
        System.out.print("Introduce real: ");
        b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Introduce cadena: ");
        c = sc.nextLine();
        modificacionVariables(a, b, c);
        System.out.println("a = "+ a + "b = " + b + "c = "+ c);
    }
    
    //todos los datos simples se pasan por copia
    public static void modificacionVariables(int a, double b, String c){
        a = a * 2;
        //b = ;
        //c = ;
        System.out.println("a = " +a);
    }
    
}
