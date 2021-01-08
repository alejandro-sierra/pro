package variables03;

import java.util.Scanner;

public class Variables03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Punto p = new Punto();
        System.out.print("X = ");p.x = sc.nextDouble();
        System.out.print("Y = ");p.y = sc.nextDouble();
        
        p.cambiaPunto();
        System.out.println(p.toString());
    }
    
}
