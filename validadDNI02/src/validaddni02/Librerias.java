package validaddni02;

import java.util.Scanner;

public class Librerias {

    public static boolean validarDNI(String cadena) throws Exception{
    
    String letras_dni="TRWAGMYFPDXBNJZSQVHLCKE";
    String letra_dni = cadena.substring(cadena.length()-1);
    String numero_dni = cadena.substring(0,cadena.length()-1);
    System.out.println(letra_dni+" "+numero_dni);
    
        try {
            int numero = Integer.parseInt(numero_dni);
            int resto = numero%23;
            String letra_calculada = letras_dni.substring(resto,resto+1);
            String letraMinuscula = letra_calculada.toLowerCase();
            if(letra_dni.compareTo(letra_calculada)==0 || letra_dni.compareTo(letraMinuscula) == 0)
            return true;
            else throw new Exception("Letra incorrecta");
        } catch (NumberFormatException e) { 
            throw new Exception ("Caracteres on numericos");
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
        
    }    
}//cierre class
