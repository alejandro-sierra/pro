package quitavocales;

import java.util.Scanner;

public class QuitaVocales {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena;
        System.out.print("Intruduce una cadena: ");
        cadena=sc.nextLine();
    
    //convertir la cadena a un array de char
        char [] lista = new char[cadena.length()];
        lista = cadena.toCharArray();
        
    //contar cuantas vocales y espacios tiene
        int numeroVocales=0;
        for(int i=0;i<lista.length;i++){
            switch (lista[i]) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                case ' ':
                    numeroVocales++;
                    break;
            }
        }
    //creamos un nuevo array de char con el numero de consonates 
        char[] listaConsonantes = new char[cadena.length()-numeroVocales];
    //copiamos del array inicial al nuevo array solo las no vocales
        int indiceConsonantes=0;
        for(int i=0;i<lista.length;i++){
            switch (lista[i]) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                case ' ':
                    break;
                default:
                    listaConsonantes[indiceConsonantes]=lista[i];
                    indiceConsonantes++;
            }
        }
    //pasar el array de char a String
        String cadena2 = new String(listaConsonantes);
        //String cadena2 = listaConsonantes.toString();
        System.out.println(cadena2);
        System.out.println("");
        
    }
    
}
