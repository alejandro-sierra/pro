package herencia02;

import java.util.ArrayList;
import java.util.Scanner;

public class Herencia02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        char repetir = 's';
        boolean salir=false;
        ArrayList<Figura> lista = new ArrayList<Figura>();
        do {
            do {
                System.out.println("1. Alta de triangulo: ");
                System.out.println("2. Alta de circulo: ");
                System.out.println("3. Alta de rectangulo: ");
                System.out.println("4. Listado de figuras: ");
                System.out.println("5. Listado de figuras de un color: ");
                System.out.println("6. Listado de triangulos: ");
                System.out.println("7. Listado de circulos: ");
                System.out.println("8. Listado de rectangulos: ");
                System.out.println("0. Salida.");
                System.out.print("   Opcion seleccoinada: ");
                opcion = sc.nextInt();
                System.out.println("");
            } while (opcion < 0 || opcion > 8);
            switch (opcion) {
                case 1:
                    do {
                        Figura t = new Triangulo();
                        t.pideDatos();
                        lista.add(t);
                        System.out.print("Desea continuar: ");
                        repetir = sc.next().charAt(0);
                        sc.nextLine();
                    } while (repetir == 's');
                    System.out.println("");
                    break;
                case 2:
                    do {
                        Figura c = new Circulo();
                        c.pideDatos();
                        lista.add(c);
                        System.out.print("Desea continuar: ");
                        repetir = sc.next().charAt(0);
                        sc.nextLine();
                    } while (repetir == 's');
                    System.out.println("");
                    break;
                case 3:
                    do {
                        Figura r = new Rectangulo();
                        r.pideDatos();
                        lista.add(r);
                        System.out.print("Desea continuar: ");
                        repetir = sc.next().charAt(0);
                        sc.nextLine();
                    } while (repetir == 's');
                    System.out.println("");
                    break;
                case 4:
                    for (Figura valor : lista) {
                        System.out.println("****Listado de Figuras****");
                        System.out.println(valor.toString());
                    }
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
            }
        } while (salir==false);

    }//cierre main 
}//cierre class
