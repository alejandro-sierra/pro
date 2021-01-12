package sort01;

import java.util.Arrays;
import java.util.Collections;

public class Sort01 {

    public static void main(String[] args) {
        String [] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis"
                , "eduardo"};
        for(int i=0;i<nombres.length;i++){
            System.out.print(nombres[i]+" ");
        }
            System.out.println("");
            //ordenar de menor a mayor
            
        Arrays.sort(nombres);
        //visualizar el resultado
        for(String value: nombres){
            System.out.print(value+" ");
        }
        System.out.println("");    
        System.out.println("");

        String [] nombres1 = {"juan", "pedro", "ana", "maria", "felipe", "luis"
                , "eduardo"};
        for(int i=0;i<nombres1.length;i++){
            System.out.print(nombres1[i]+" ");
        }
            System.out.println("");
            //ordenar de menor a mayor
            
        Arrays.sort(nombres1,Collections.reverseOrder());
        //visualizar el resultado
        for(String value: nombres1){
            System.out.print(value+" ");
        }
        System.out.println("");    
        System.out.println("");    
        
        
        int [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
        Arrays.sort(numeros);
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        
        Integer [] numeros1 = {3, 5, 1, 2, 1, 7, 0, -1};
        Arrays.sort(numeros1,Collections.reverseOrder());
        for(int i=0;i<numeros1.length;i++){
            System.out.print(numeros1[i]+" ");
        }
        System.out.println("");
        

        
        
    }//cierre metodo
    
}//cierre class
