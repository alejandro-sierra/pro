package ejerciciocontrol04;

import java.util.Scanner;

public class EjercicioControl04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Nota: ");nota = sc.nextInt();
    switch (nota){
            case 10:
                System.out.println("Matricula");
            break;
            case 9: case 8:
                System.out.println("Soobresaliente");
            break;
            case 7:
                System.out.println("Notable");
            break;
            case 6:
                System.out.println("Bien");
            break;
            case 5:
                System.out.println("Aprobado");
            break;
            case 4: case 3: case 2: case 1: case 0:
                System.out.println("Suspenso");
            break;
            default:
                 System.out.println("Incorerecto");
            break;
        }
    }
    
    
}
