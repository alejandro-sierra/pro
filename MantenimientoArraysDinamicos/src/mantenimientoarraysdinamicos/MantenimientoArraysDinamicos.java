package mantenimientoarraysdinamicos;

import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;

public class MantenimientoArraysDinamicos {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String salir;
        int seleccion, numero;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista1 = new ArrayList<Integer>(lista);

        for (;;) {

            System.out.println("********* Mantenimiento de Arrays estáticos *********");
            System.out.println("                1. Altas");
            System.out.println("                2. Bajas");
            System.out.println("                3. Consultas");
            System.out.println("                4. Modificaciones");
            System.out.println("                5. Listado");
            System.out.println("                6. Salir");
            System.out.print("                Opción seleccionada: ");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    for (;;) {
                        altas(lista);
                        System.out.print("Continuar? (s/n): ");
                        sc.nextLine();
                        salir = sc.nextLine();

                        if (salir.equals("s") || salir.equals("S")); else {
                            break;
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    for (;;) {
                        if (lista.isEmpty()) {
                            System.out.println("Lista vacía");
                            break;
                        } else {
                            bajas(lista);

                            System.out.print("Continuar? (s/n): ");
                            sc.nextLine();
                            salir = sc.nextLine();

                            if (salir.equals("s") == true || salir.equals("S")); else {
                                break;
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    consultas(lista);
                    System.out.println("");
                    break;
                case 4:
                    modificaciones(lista);
                    System.out.println("");
                    break;
                case 5:
                    listar(lista);
                    System.out.println("");
                    break;
                case 6:
                    break;
            }
            if (seleccion == 6) {
                break;
            }
        }
    }
    // case 1   

    public static void altas(ArrayList<Integer> lista) {
        int numero;
        System.out.print("Introduce entero: ");
        numero = sc.nextInt();
        lista.add(numero);
    }

    // case 2
    public static void bajas(ArrayList<Integer> lista) {
        int indice;
        System.out.print("Seleccione el elemento a borrar (de 1 a " + lista.size() + "): ");
        indice = sc.nextInt();
        lista.remove(indice - 1);

    }

    // case 3
    public static void consultas(ArrayList<Integer> lista) {
        int indice;
        do {
            System.out.print("Seleccione el elemento a consultar (de 1 a " + lista.size() + "): ");
            indice = sc.nextInt();

        } while (indice < 1 || indice > lista.size());
        System.out.println("Valor: " + lista.get(indice - 1));

    }

    // case 4
    public static void modificaciones(ArrayList<Integer> lista) {
        int indice;
        int nuevo;
        do {
            System.out.print("Seleccione el elemento a modificar (entre 1 y " + lista.size() + "): ");
            indice = sc.nextInt();
        } while (indice < 1 || indice > lista.size());
        System.out.println("El elemento es: " + lista.get(indice - 1) + ".");
        System.out.print("Inserte el nuevo valor: ");
        nuevo = sc.nextInt();
        lista.set(indice - 1, nuevo);

    }

    // case 5
    public static void listar(ArrayList<Integer> lista) {
        for (Integer valor : lista) {
            System.out.print(valor + " ");
        }

    }
}
