package profesor02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//********** INICIO DEL CURSO **********        
        Profesor lista[] = new Profesor[0];
        System.out.print("Curso academico: ");
        String curso = sc.nextLine();
        Profesor.setCurso(curso);
        System.out.print("Pago por horas extra: ");
        Profesor.setPagoPorHorasExtra(sc.nextDouble());
//********** DURANTE DEL CURSO **********        
        int opcion = 0;
        do{
            System.out.println("\nSELECCIONE UNA OPCION:");
            System.out.println("1. ALTA DE UN PROFESOR");
            System.out.println("2. BAJA DE UN PROFESOR");
            System.out.println("3. CONSULTA DE DATOS PERSONALES DE UN PROFESOR");
            System.out.println("4. INTRODUCION HORAS EXTRAS REALIZADAS EN UN MES");
            System.out.println("5. LISTADO DE PROFESORES");
            System.out.println("6. LISTADO DE NOMINAS DE UN MES");
            System.out.println("0. SALIR DEL PROGRAMA");
            System.out.print("     OPCION SELECIONADA: ");opcion=sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    Profesor p = new Profesor();
                    p.nuevoProfesor();
                    lista = altaProfesor(lista, p);
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    for(Profesor valor: lista){
                        System.out.println(valor.imprimir());
                    }
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 0:
                    
                    break;
            }
            
            
        
        
        }while(opcion !=0);
        
        
        
//        Profesor p1 = new Profesor();
//        p1.nuevoProfesor();
//        System.out.println(p1.imprimir());
        
    }//cierre main
    public static Profesor[] altaProfesor(Profesor[] lista, Profesor p){
    Profesor[] listaNueva = new Profesor[lista.length+1];
    for(int i=0;i<lista.length;i++){
        listaNueva[i] = lista[i];
    }
    listaNueva[listaNueva.length-1] = p;
    return listaNueva;
    }

}//cierre class