package ejerciciocontrol05;

import java.util.Scanner;

public class EjercicioControl05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Numero entero: ");n = sc.nextInt();
        if (n%2==0){
            System.out.println("Nuemro es par.");
        }else {
            System.out.println("Numero es impar.");
        }
        
        
    }
    
}
