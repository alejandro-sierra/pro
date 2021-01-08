package interaciones01;

import java.util.Scanner;

public class Interaciones01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for valor inicial (int i=0) y mientras se cumpla esta condicion (i<=20) ejecuta (i++)
        int suma=0;
            for (int i=0;i<=20;i++) {
            System.out.print(i+ " ");
            suma = suma + i;
        }
            System.out.println("");
            System.out.print("La suma de los 20 primeros numeros vale " + suma + " ");
            System.out.println("");

        //while mientras se cumpla la condicion ejecura el bloque    
            suma =0;
            int i =0;
            while (i<=20){
                suma = suma + i;
                System.out.print(i + " ");
                i++;
            }
            System.out.println("");
            System.out.print("La suma de los 20 primeros numeros vale " 
                    + suma + " ");
            System.out.println("");
            
        //ejecuta el bloque mientras se cumpla la condicion
        i= 0;
        do{
            suma = suma + i;
            System.out.print(i +" ");
            i++;
        }while (i<=20);
        System.out.println("");
       
        int nota;
        do{
            System.out.print("Nota:");nota = sc.nextInt(i);
            
        }while (nota<0 || nota>10);
        
       //repetimos con un while
       System.out.print("Nota: ");nota = sc.nextInt();
       while (nota<0 || nota>10){
       System.out.print("Nota: "); nota = sc.nextInt();
       }
    }
}