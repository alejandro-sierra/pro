package divisionexcepcionampliada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExcepcionAmpliada {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean correcto01 = false;
        do{
            try {//trycatch + tabulador
            System.out.print("Numerador: ");a=sc.nextInt();//codigo a proteger
            correcto01=true;
            
            }catch(InputMismatchException e){
                System.out.println("Caracteres incorrectos.");
            }catch (Exception e){
                //System.out.println(e.toString());
                System.out.println("Error generico en datos.");
            }finally{
                sc.nextLine();
            }
            
        }while(!correcto01);
        
    //denominador
            boolean correcto02=false;
        do{
            correcto01=false;
            do{
                try {//trycatch + tabulador
                System.out.print("Denominador: ");b=sc.nextInt();//codigo a proteger
                correcto01=true;

                }catch(InputMismatchException e){
                    System.out.println("Caracteres incorrectos.");
                }catch (Exception e){
                    //System.out.println(e.toString());
                    System.out.println("Error generico en datos.");
                }finally{
                    sc.nextLine();
                }
            }while(correcto01==false);
            
            try {
                System.out.println("El resultado de "+a+" / "+b+" = "+a/b);
                correcto02=true;
            } catch (Exception e) {
                System.out.println("No se puede dividir por 0.");
            }
        }while(correcto02==false);
        
    }//cierre main
//ArithmeticException
//InputMismatchException
//Exception-----> Excepcion generica
}//cierre class
