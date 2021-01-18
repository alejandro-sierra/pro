package divisionexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExcepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean correcto = false;
        do{
            try {//trycatch + tabulador
            System.out.print("Numerador: ");a=sc.nextInt();//codigo a proteger
            correcto=true;
            
            }catch(InputMismatchException e){
                System.out.println("Caracteres incorrectos.");
            }catch (Exception e){
                //System.out.println(e.toString());
                System.out.println("Error generico en datos.");
            }finally{
                sc.nextLine();
            }
            
        }while(!correcto);//correcto==false)
        correcto=false;
        do{
            try {//trycatch + tabulador
            System.out.print("Denominador: ");b=sc.nextInt();//codigo a proteger
            if(b==0) throw new Exception("No puedo dividir por 0");
            correcto=true;
            
            }catch(InputMismatchException e){
                System.out.println("Caracteres incorrectos.");
            }catch (Exception e){
                //System.out.println(e.toString());
                System.out.println(e.getMessage());
            }finally{
                sc.nextLine();
            }
        }while(!correcto);
        System.out.println("El resultado de "+a+" / "+b+" = "+a/b);
        
    }//cierre main
//ArithmeticException
//InputMismatchException
//Exception-----> Excepcion generica
}//cierre class