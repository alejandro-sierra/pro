package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;

        System.out.println("Introduccion de datos de un libro");
        System.out.print("Proporciona el nombre: ");nombre=sc.nextLine();
        System.out.print("Proporciona el id: ");id=sc.nextInt();
        System.out.print("Proporciona el precio: ");precio=sc.nextDouble();
        System.out.print("Proporciona el envio gratuito: ");envioGratuito=sc.nextBoolean();
        
        System.out.println(nombre+" "+"#"+id);
        System.out.println("Precio "+precio+"€");
        System.out.println("Envio gratuito "+envioGratuito);
    }

}
