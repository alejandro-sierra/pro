package ejercicioscontrol02;

import java.util.Scanner;

public class EjerciciosControl02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Nota: ");nota = sc.nextInt();
        if (nota >=5){
            System.out.println("Has aprobado");
        }else {
            System.out.println("Has suspendido");
        }
        //filtre si la nota no es correcta
        if (nota<0 || nota>10){
            System.out.println("Nota no valida");
        }else {
                if (nota>=5){
                    System.out.println("Has aprobado");
                }else {
                    System.out.println("Has suspendido");
                }
              }
   }
    
}
