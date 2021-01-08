package aplicacion415;

import java.util.Scanner;

public class Aplicacion415 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Numero: ");n=sc.nextInt();
        if (n>=10 && n<=20){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
