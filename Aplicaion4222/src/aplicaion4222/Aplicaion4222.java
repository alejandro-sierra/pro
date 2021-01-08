package aplicaion4222;

import java.util.Scanner;

public class Aplicaion4222 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0, n;
        System.out.print("Numero mayor: ");n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5!=0){
                System.out.print(i + " ");
                suma = suma + i;
            }
        }
        System.out.println("");
        System.out.println("La suma vale "+suma);
    }
    
}
