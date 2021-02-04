package stringbuilder01;

import java.util.Scanner;

public class puntuacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        long numero = sc.nextLong();
        String s = Long.toString(numero);
        StringBuilder cadena = new StringBuilder(s);
        cadena.reverse();
        System.out.println(cadena);
        
        int puntos = (int) (cadena.length()/3);//parte entera
        if(cadena.length()%3 == 0) puntos--;
        for(int i=1;i<=puntos;i++){
            cadena.insert(4*i-1,'.');
        }
        System.out.println(cadena.reverse());
        System.out.println("");
        StringBuilder cadena1 = new StringBuilder(s);
        cadena1.reverse();
        for(int i=3;i<cadena1.length();i=i+4){
            cadena1.insert(i, '.');
        }
        System.out.println(cadena1.reverse());
        
        
        
        
        
    }//cierre main
}//cierre class
