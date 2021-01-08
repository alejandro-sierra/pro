package ejerciciocontrol03;

import java.util.Scanner;

public class EjercicioControl03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Nota: ");nota = sc.nextInt();
        if (nota<0 || nota>10){
            System.out.println("Nota incorrecta");
        }else if(nota ==10) {
            System.out.println("Es matricula de honor");
                    }else if (nota==9){
                    System.out.println("Sobresaliente");
                        }else if (nota>=7){
                                System.out.println("Notable");
                        }else if (nota >= 5){
                                    System.out.println("Aprobado");
                                    }else {
                                        System.out.println("Suspendido");
                             }
        
        
    }
    
}
