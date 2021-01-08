package lista;

import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Numero de elementos: ");n=sc.nextInt();
        //Introducir n enteros en el array lista
        int[] lista = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Elementos "+i+" : ");
            lista[i]=sc.nextInt();
        }
        System.out.println("");
        
        
    //llamamos a un metodo que le pasamos la lista y no devuelve 
    //lista 2 con primero pares y despues impares
    int[] lista2 = listaParesImpares(lista);
        System.out.println("");
    //listamos la lista recibida
    for(int i=0;i<n;i++){
        System.out.println("");
        System.out.print(lista2[i]+" ");
    }
    
    //arrays con solo pares
    int[] lista3 = listaPares(lista);
    

    }
    
    
    
    
    
    
    
    public static int[] listaPares(int[]lista){
    //vamos a contar los pares
    int contador=0;
        for(int valor: lista){
            if(valor%2==0){contador++;}
            
        }
        int[] lista2 = new int [contador++];
        int j=0; //indice de la lista2
        for(int valor: lista){
           if(valor%2==0){
               lista2[j]=valor;
               j++;
           }
        }
        return lista2;        
    
    }
    
    
    
    
    
    
    
    
    
    
    public static int[] listaParesImpares(int[] lista){
    int [] lista2 =new int[lista.length];
    int j=0; //contador de indice para lista2
    //llemos toda la lista y pasamos a la lista2 solo los pares
    for(int valor: lista){
        if(valor%2==0){
            lista2[j] = valor;
            j++;
        }
    }
    //leemos toda la lista, otra vez y pasamos a lista2 los impares
    for(int i=0;i<lista.length;i++){
        if(lista[i]%2!=0){
            lista2[j]=lista[i];
            j++;
        }
    }

    return lista2;

    }
}
