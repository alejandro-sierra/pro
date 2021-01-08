package aplicaion416;

import java.util.Scanner;

public class Aplicaion416 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Numero: ");n=sc.nextInt();
        if (n==0){
            System.out.println("Nulo");
        }else if(n%2==0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
    
}
