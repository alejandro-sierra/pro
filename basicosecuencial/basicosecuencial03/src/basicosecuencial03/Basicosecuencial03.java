package basicosecuencial03;

//Escribe un programa java que lea un numero entero por teclado y odtiene

import java.util.Scanner;

//y muestra por pantalla el doble y  el triple de ese numero.

public class Basicosecuencial03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero entero: ");
        numero = sc.nextInt();
        System.out.println("Numero introducido: " + numero);
        System.out.println("Doble de " + numero + " -> " + 2*numero);
        System.out.println("Triple de " + numero + " -> " + 3*numero);

    }
    
}
