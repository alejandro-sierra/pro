package juegoazar;

import java.util.Scanner;

public class JuegoAzar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random()*(100-1+1))+1;
        int numero;
        int i = 1;
        for(;;){
            System.out.print("Introduce un numero entre 1 y 100: ");
            numero  = sc.nextInt();
            sc.nextLine();
            if(numero==n){
               break;
            }else if (numero  > n){
                System.out.println("El numero introducido es mayor");
            }else {
                System.out.println("El numeor intrudicido es menor");
            }
            i++;
        }
            System.out.println("n = " + n);
            System.out.println(i+ "intentos");
        }

    }
    

