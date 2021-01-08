package aplicacion4214;

import java.util.Scanner;

public class Aplicacion4214 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m, potencia=1;
        int n;
        System.out.print("Base: ");m=sc.nextDouble();
        sc.nextLine();
        System.out.print("Exponente: ");n=sc.nextInt();
        if (n==0){
        potencia=1;
        }else if(n>=1){
            for(int i=1;i<=n;i++){
                potencia = potencia*m;
        }
        }else {
            for (int i=1;i>=n;i--){
                potencia = potencia/m;
            }
        }   
                       System.out.println(m +" elevado a "+n+" vale "+potencia);
    }
}
