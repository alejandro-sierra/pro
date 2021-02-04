package arraysdinamicos01;

import java.util.ArrayList;
import java.util.Scanner;


public class ArraysDinamicos01 {

    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion,numero;
        String salir;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        do{
            System.out.println("\n************** Mantenimiento Arrays estaticos **************");
            System.out.println("                1. Altas de un elemento");
            System.out.println("                2. Consulta de un elemento de la lista");
            System.out.println("                3. Modificaciones");
            System.out.println("                4. Baja de un elemento");
            System.out.println("                5. Listado");
            System.out.println("                0. Salir");
            System.out.print("                   Opcion seleccionada: ");opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do{
                        altas(lista);
                        System.out.print("Quieres continuar? (s/n): ");sc.nextLine(); salir=sc.nextLine();
                        
                    }while(salir.equals("s") || salir.equals("S"));
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    if(lista.isEmpty()){
                        System.out.println("Lista vacia");
                        break;
                    }else
                    do{
                        bajas(lista);
                        System.out.print("Quieres continuar? (s/n): ");sc.nextLine(); salir=sc.nextLine();
                        
                    }while(salir.equals("s") || salir.equals("S"));
                    break;
                case 5:
                    listar(lista);
                    System.out.println("");
                    break;
                case 0:
                    //salir
                    break;
            }
            
        }while(opcion>0||opcion<0);
    }//cierre main
    
    
    //case 1
    public static void altas(ArrayList<Integer>lista){
        int numero;
        System.out.print("Introduce entero:  ");numero=sc.nextInt();
        lista.add(numero);
    }
    
    //case 2
    
    
    //case 3
    
    
    //case 4
    public static void bajas(ArrayList<Integer>lista){
        int numero;
        System.out.print("Seleccione el elemento a elimianar (entre el 1 y "+lista.size()+ "): ");numero=sc.nextInt();
        lista.remove(numero-1);
    }
    //case 5
    public static void listar(ArrayList<Integer>lista){
        for(Integer valor: lista){
            System.out.println(valor+" ");
        }
    }
}//cierre class