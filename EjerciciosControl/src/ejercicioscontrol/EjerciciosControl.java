package ejercicioscontrol;

import java.util.Scanner;

public class EjerciciosControl {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a,b,c;
        System.out.print("a = ");a = sc.nextDouble();
        System.out.print("b = ");b = sc.nextDouble();
    //condicionador double
        if(b !=0){
            System.out.println("a / b = " + a/b);
            System.out.println("");
    }
    else {
            System.out.println("El denominador no puede ser cero.");
    }
    //condicionador comprimido
    String resultado;
    resultado = (b==0)? "El denominador no puede ser cero":"a / b =" + a/b;
    System.out.println(resultado);
}
}    
