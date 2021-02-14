package profesorarraylist;

import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("\nSELECCIONE UNA OPCION:");
            System.out.println("1. ALTA DE UN PROFESOR");
            System.out.println("2. BAJA DE UN PROFESOR");
            System.out.println("3. CONSULTA DE DATOS PERSONALES DE UN PROFESOR");
            System.out.println("4. INTRODUCION HORAS EXTRAS REALIZADAS EN UN MES");
            System.out.println("5. LISTADO DE PROFESORES");
            System.out.println("6. LISTADO DE NOMINAS DE UN MES");
            System.out.println("7. ORDENAR POR NOMBRE");
            System.out.println("0. SALIR DEL PROGRAMA");
            System.out.print("     OPCION SELECIONADA: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1");
                    break;
            }
            switch (opcion) {
                case 2:
                    System.out.println("2");
                    break;
            }
            switch (opcion) {
                case 3:
                    System.out.println("3");
                    break;
            }
            switch (opcion) {
                case 4:
                    System.out.println("4");
                    break;
            }
            switch (opcion) {
                case 5:
                    System.out.println("5");
                    break;
            }
            switch (opcion) {
                case 6:
                    System.out.println("6");
                    break;
            }
            switch (opcion) {
                case 7:
                    System.out.println("7");
                    break;
            }

        } while (opcion < 0 || opcion > 0);

    }//cierre main
}//cierre class
