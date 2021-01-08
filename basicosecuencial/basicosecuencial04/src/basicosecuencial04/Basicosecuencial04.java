package basicosecuencial04;
 
//Programa que lea una cantidad de grados centigrados y la pase a grados Fahrenheit.
//La formula correspondiente para pasar de grados centigrados a fahrenheit es:
//F = 32 + ( 9 * C / 5)

import java.util.Scanner;
public class Basicosecuencial04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.print("Introduce grados Centigrados: ");
        gradosC = sc.nextDouble();
        gradosF = 32 + ( 9 * gradosC / 5);
        System.out.println(gradosC + "ºC = " + gradosF +  "ºF");
        
    }
    
}
