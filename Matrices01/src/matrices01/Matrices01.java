package matrices01;

import java.util.Scanner;

public class Matrices01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m,n;
        System.out.print("Numero de filas: ");m=sc.nextInt();
        System.out.print("Numero de columnas: ");n=sc.nextInt();
        //creamos una matriz de enteros de m * n
        int[][] matriz = new int[m][n];
        
        //leemos todas las columnas fijando una fila
        /*for(int fila=0;fila<m;fila++){
            for(int columna=0;columna<n;columna++){
                System.out.println(fila+","+columna+" ");
            }
            System.out.println("");
        }
        System.out.println("");*/
        
        //leemos todas las filas fijando una columna
        for(int columna=0;columna<n;columna++){
            for(int fila=0;fila<m;fila++){
                System.out.print(fila+","+columna+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //introducir datos fila, columna
        for(int fila=0;fila<m;fila++){
            //por cada fila recorremos todas las columnas
            for(int columna=0;columna<n;columna++){
                System.out.print("Introduce elementos ("+fila+","+columna+"): ");
                matriz[fila][columna]=sc.nextInt();
            }
            System.out.println("");
        }
        imprimeMatriz(matriz);
        int suma = sumaElementos(matriz);
        System.out.println("La suma de todos los elementos vale "+suma);
        
        suma = sumaPrimeraFila(matriz);
        System.out.println("La suma de los elementos de la primera fila vale: "+suma);
        
        //suma= sumaUltimaFila(matriz);
        System.out.println("La suma de los elementos de la ultima fila vale: "+suma);
    }
 
    //creamos el metodo imprimeMatriz
    public static void imprimeMatriz(int[][] m){
        for(int fila=0;fila<m.length;fila++){
            for(int columna=0;columna<m[0].length;columna++){
                System.out.print(m[fila][columna]+" ");
            }
            System.out.println("");
        }
    }
    
    public static int sumaPrimeraFila(int [][] m){
        int suma=0;
        int fila=0;//fijamos la fila 0 
        
        //recorremos todos los elementos de la fila 0
        for(int columna=0;columna<m[0].length;columna++){
            suma = suma + m[fila][columna];
        }
        return suma;
    }
 
    public static int sumaUltimaFilaI(int [][] m){
        int suma=0;
        int fila=m.length-1;//fijamos la fila a la ultima fila 
        
        //recorremos todos los elementos de la fila 0
        for(int columna=0;columna<m[0].length;columna++){
            suma = suma + m[fila][columna];
        }
        return suma;
    
    }
    
    //creamos el metodo sumaElementos
    public static int sumaElementos(int[][] m){
        int suma=0;
        for(int fila=0;fila<m.length;fila++){
            for(int columna=0;columna<m[0].length;columna++){
                suma+=m[fila][columna];
            }
        }
        return suma;
    }
    
}
