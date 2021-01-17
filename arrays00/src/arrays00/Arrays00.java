package arrays00;

import java.util.Scanner;

public class Arrays00 {

    static Scanner sc=new Scanner(System.in); //tambien se le puede poner public delande de static

    public static void main(String[] args) {
        int a [] = new int[0];
        int b [] = new int[0];
        int c [] = new int[0];
        int opcion;
        String salir;
        for(;;){
            System.out.println("\n********** Mantenimiento Arrays estaticos **********");
            System.out.println("                1. Altas");
            System.out.println("                2. Bajas");
            System.out.println("                3. Consultas");
            System.out.println("                4. Modificaciones");
            System.out.println("                5. Listado");
            System.out.println("                6. Salir");
            System.out.print("                Opcion seleccionada: ");opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for(;;){
                    a = altas(a);//altas(a) recibe la direccion de la nueva lista
                        System.out.print("Continuar (s o S): ");
                        sc.nextLine();
                        salir = sc.nextLine();
                        if (salir.equals("s") || salir.equals("S")) continue;
                        else break;
                    }
                  break;
                case 2:
                    if (a.length==0){
                    System.out.println("Lista vacia");
                    break;
                    }
                    for(;;){
                    a = bajas(a);
                        System.out.print("Continuar (s o S): ");
                        sc.nextLine();
                        salir = sc.nextLine();
                        if (salir.equals("s") || salir.equals("S")) continue;
                        else break;
                    }
                    break;
                case 3:
                    consultas(a);
                    break;
                case 4:
                    modificaciones(a);
                    break;
                case 5:
                    listado(a);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            if (opcion==6) break;
        }
    }
    
    
    
    
    

public static int[] altas(int [] lista){
    int n;
    int nueva [] = new int [lista.length+1];//creamos una nueva lista con un elemento mas
    System.out.print("Nuevo elemento: ");n=sc.nextInt();
    for(int i=0;i<lista.length;i++){
        nueva[i] = lista[i];
    }//hemos pasador los datos de lista (a en el main) a nueva
    nueva [nueva.length-1] = n;//colocamos el nuevo valor al final de la lista nueva
    return nueva;
    //devolvemos la direccion de la nueva lista
}
public static int[] bajas(int[] lista){
    listado(lista);
    int nueva[] = new int [lista.length-1];
    int indice;
    for(;;){
    System.out.print("Indice a eliminar (entre 0 y "+(lista.length-1)+" ): ");
    indice=sc.nextInt();
    if (indice>=0 && indice<lista.length-1)break;
    else System.out.println("Indice incorrecto");
    }
    int j=0;
    for(int i=0;i<lista.length; i++){
        if (i!=indice){
            nueva[j]=lista[i];
        }
        
    }
    return nueva;
}
public static void consultas(int[] lista){
    int indice;
    for(;;){
    System.out.print("Numero de registro (entre 0 y "+(lista.length-1)+". -1 salir) :" );
    indice=sc.nextInt();
    if (indice==-1) break;
    if (indice<0 || indice>lista.length-1)
        System.out.println("Registro equivocado");
    else System.out.println("Valor =" +lista[indice]);
    }
}
public static void modificaciones(int[] lista){
    int indice;
    for(;;){
    System.out.print("Numero de registro (entre 0 y "+(lista.length-1)+". -1 salir) :" );
    indice=sc.nextInt();
    if (indice==-1) break;
    if (indice<0 || indice>lista.length-1)
        System.out.println("Registro equivocado");
    else {
        System.out.println("Valor =" +lista[indice]);
        System.out.print("Nuevo valor: ");
        lista[indice]=sc.nextInt();
        
    }
    }
}
public static void listado(int [] lista){
    for (int i=0;i<lista.length;i++){
        System.out.print(lista[i]+" ");
    }
    System.out.println("");
    //lectura de toda la lista con foreach
    //for (int valor:lista){
        //System.out.print(valor+" ");
    //}
    //System.out.println("");
}
}