package variable02;

import java.util.Scanner;

public class Variable02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Base: ");base= sc.nextDouble();
        System.out.print("Altura: ");altura= sc.nextDouble();
        area = calculaArea(base, altura);
        
    }
    public static double calculaArea(double a, double b){
        double s;
        s = a * b/2;
        return s;
    } 
}
