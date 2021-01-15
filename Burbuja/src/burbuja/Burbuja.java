package burbuja;

public class Burbuja {

    public static void main(String[] args) {
                int aux = 0;
        int[] numeros = {3, 48, 49, 46, 21, 5, 31, 43, 50};
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println("");
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                // i me indica la pasada
                if (numeros[j] > numeros[j+1]) {
                    // cambiar
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
               // System.out.print(numeros[j] + " ");
                
            }
           // System.out.println("");
        }
    for(int valor: numeros){
        System.out.print(valor+ " ");
    }

        
    }
    
}
