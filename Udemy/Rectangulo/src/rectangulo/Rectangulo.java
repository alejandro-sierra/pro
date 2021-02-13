package rectangulo;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("Proporcina el alto: ");
        int alto=sc.nextInt();
        System.out.print("Porporcina el ancho: ");
        int ancho=sc.nextInt();
        
        System.out.println("Area: "+(alto*ancho));
        System.out.println("Perimetro: "+(alto+ancho)*2);
    }
    
}
