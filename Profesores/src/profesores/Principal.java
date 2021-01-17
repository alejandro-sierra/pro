package profesores;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profesor lista[] = new Profesor[0];
        System.out.print("Curso: ");
        Profesor.setCurso(sc.nextLine());
        System.out.print("Importe Horas Extra: ");
        Profesor.setPagoPorHorasExtra(sc.nextInt());
          
        int opcion;
        do{
        System.out.println("\nS E L E C C I O N E   U N A   O P C I O N");
            System.out.println("\n1. ALTA DE UN PROFESOR");
            System.out.println("\n2. BAJA DE UN PROFESOR");
            System.out.println("\n3. CONSULTA DE DATOS PEROSONALES DE UN PROFESOR");
            System.out.println("\n4. INTRODUCIR HORAS EXTRAORDINARIAS DE UN MES");
            System.out.println("\n5. LISTADO DE PROFESORES");
            System.out.println("\n6. LISTADO DE NOMINAS DE UN MES");
            System.out.println("\n0. SALIR DEL PROGRAMA");
            System.out.print("\n\nOpcion seleccionada: ");opcion=sc.nextInt();
            
            switch (opcion) {
                case 1:
                    Profesor p1 = new Profesor();
                    Profesor.nuevoProfesor(p1);
                    lista = altaProfesor(lista, p1);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    break;
                default:
            }

        }while(opcion!=0);
            
    }//cierre main

public static Profesor[] altaProfesor(Profesor lista[],Profesor p){
    Profesor [] nueva = new Profesor[lista.length+1];
    for(int i = 0; i < lista.length; i++){
        nueva[i]=lista[i];
    }
    nueva[nueva.length-1] = p;
    return lista;
}
            
}//cierre class
        


//        Profesor p1 = new Profesor();
//        p1.leerProfesor();
//        p1.setHorasExtra(new int []{0,12,0,5,10,0,10,5,15,9,9,21});
//        p1.ImprimeProfesor(9);


    
    

