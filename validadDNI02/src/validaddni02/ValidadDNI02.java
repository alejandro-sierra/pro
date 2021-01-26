package validaddni02;

import java.util.Scanner;

public class ValidadDNI02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        boolean correcto = false;
        do{
                System.out.print("Introducir DNI con la letra: ");
                cadena = sc.nextLine();
            try {
                correcto = Librerias.validarDNI(cadena);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(correcto==false); //!correcto
        
    }//cierre main
}//cierrre class
