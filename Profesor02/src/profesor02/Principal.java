package profesor02;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, mes, horas;
//********** INICIO DEL CURSO **********        
        Profesor lista[] = new Profesor[0];
//        Esto es para no tener que rellenar simpre los mimos datos.
//        Profesor lista[] = new Profesor[3];
//        lista[0] = new Profesor("12345678A", "Profesor 1", 1100, 10);
//        lista[1] = new Profesor("12345678B", "Profesor 2", 2100, 10);
//        lista[2] = new Profesor("12345678C", "Profesor 3", 1400, 10);

        System.out.print("Curso academico: ");
        String curso = sc.nextLine();
        Profesor.setCurso(curso);
        System.out.print("Pago por horas extra: ");
        Profesor.setPagoPorHorasExtra(sc.nextDouble());
//********** DURANTE DEL CURSO **********        
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
//          System.out.println("8. ORDENAR POR ");
            System.out.println("0. SALIR DEL PROGRAMA");
            System.out.print("     OPCION SELECIONADA: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Profesor p = new Profesor();
                    p.nuevoProfesor();
                    lista = altaProfesor(lista, p);
                    break;
                case 2:
                    numero = 0;
                    do {
                        //codfigo de profesor, el indice en el arrays es 1 menos (empieza en 0)
                        System.out.print("Nº de profesor a borar (entre 1 y " + lista.length + "): ");
                        numero = sc.nextInt();
                    } while (numero < 1 || numero > lista.length);
                    if (lista.length != 0) {
                        lista = bajaProfesor(lista, numero - 1);
                    }
                    break;
                case 3:
                    numero = 0;
                    do {
                        System.out.print("Nº de profesor a borar (entre 1 y " + lista.length + "): ");
                        numero = sc.nextInt();
                    } while (numero < 1 || numero > lista.length);
                    System.out.println(lista[numero - 1].imprimir());
                    break;
                case 4:
                    do {
                        System.out.print("Mes a introducir horas extra (entre 1 y 12): ");
                        mes = sc.nextInt();
                        sc.nextLine();
                    } while (mes < 1 || mes > 12);
                    for (Profesor valor : lista) {
                        System.out.print("Nombre: " + valor.getNombre() + "    " + "Horas: ");
                        horas = sc.nextInt();
                        sc.nextLine();
                        valor.setHorasExtra(mes, horas);
                    }
                    break;
                case 5:
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println("Nº Profesor: " + (i + 1));
                        System.out.println(lista[i].imprimir());
                    }
//                    for(Profesor valor: lista){
//                        System.out.println(valor.imprimir());
//                    }
                    break;
                case 6:
                    do {
                        System.out.print("Mes a listar nominas (entre 1 y 12): ");
                        mes = sc.nextInt();
                        sc.nextLine();
                    } while (mes < 1 || mes > 12);
                    for (Profesor valor : lista) {
                        System.out.println(valor.imprimirNomina(mes));
                    }
                    break;
                case 7:
                    Arrays.sort(lista);
                    break;
                case 0:

                    break;
            }

        } while (opcion != 0);

//        Profesor p1 = new Profesor();
//        p1.nuevoProfesor();
//        System.out.println(p1.imprimir());
    }//cierre main

    public static Profesor[] altaProfesor(Profesor[] lista, Profesor p) {
        Profesor[] listaNueva = new Profesor[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            listaNueva[i] = lista[i];
        }
        listaNueva[listaNueva.length - 1] = p;
        return listaNueva;
    }

    public static Profesor[] bajaProfesor(Profesor[] lista, int indice) {
        Profesor[] listaNueva = new Profesor[lista.length - 1];
        for (int i = 0; i < lista.length; i++) {
            if (i < indice) {
                listaNueva[i] = lista[i];
            } else if (i > indice) {
                listaNueva[i - 1] = lista[i];
            }
        }
        return listaNueva;
    }

}//cierre class
