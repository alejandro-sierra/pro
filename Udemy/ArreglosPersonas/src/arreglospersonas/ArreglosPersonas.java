package arreglospersonas;

import java.util.Scanner;

public class ArreglosPersonas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Pepe");
        personas[1] = new Persona("Elean");

        System.out.println("persona 0= " + personas[0]);
        System.out.println("persona 0= " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas =" + personas[i]);
        }
        System.out.println("");
        String frutas[] = {"Naranjas", "Manjanas", "Uvas", "Platanos"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
        }
    }

}
