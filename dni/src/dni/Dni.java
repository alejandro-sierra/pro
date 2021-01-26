    package dni;

import java.util.Scanner;

public class Dni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni;
        System.out.print("Introduce DNI (sin letra): ");dni=sc.nextLine();
        boolean correcto = verificaDNI(dni);
    }
    
    public static boolean verificaDNI(String dni){
        String letras_dni="TRWAGMYFPDXBNJZSQVHLCKE";
        boolean correcto=false;
        int longitudad = dni.length();
        String numero = dni.substring(0, longitudad-1);//leemos menos la letra
        String letra = dni.substring(longitudad-1);
        //convertimos el string dni en un entero
        int idni= Integer.parseInt(numero);
        int resto = idni%23;
        char letraDNI = letras_dni.charAt(resto);
        System.out.println(dni+" "+numero+" "+letra+" ");
        return true;
    }
    
}
