package validaciondni;

import java.util.Scanner;

public class ValidacionDNI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra_dni="TRWAGMYFPDXBNJZSQVHLCKE";
        boolean correcto=false;
        String cadena, numerosDNI, letraDNI;
        char[] letras = letra_dni.toCharArray();
        int dni;
        do{
            
            System.out.print("Introduce el DNI con letra: ");
            cadena = sc.nextLine();
            letraDNI= cadena.substring(cadena.length()-1);
            numerosDNI = cadena.substring(0,cadena.length()-1);
            
            try {
                dni=Integer.parseInt(numerosDNI);
                int resto = dni%23;
                System.out.println(letras[resto]);
                if(letras[resto]==letraDNI.charAt(0))
                correcto=true;
                else throw new Exception("Letra incorrecta");
            } catch (NumberFormatException e) {
                System.out.println("Caracteres no numericos");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(correcto==false);
        
    }//cierre main
    
}//cierre class
