package bonoloto;

public class BonoLoto {

    public static void main(String[] args) {
        System.out.print("Numeros extraidos: ");
        int [] numerosRojos=new int[6];
        for(int i=0;i<numerosRojos.length;i++){
            numerosRojos[i] = (int) (Math.random()*(49-1)+1);
            
            System.out.print(numerosRojos[i]+" ");
        }
        System.out.println("");
        int [][] tabla=new int [10][5];
        for(int filas=0;filas<10;filas++){
            for(int columnas=0;columnas<5;columnas++){
                tabla[filas][columnas]=columnas*10+filas;
                
                 /*for (int i=0;i<numerosRojos.length;i++){
                    for(int j=0;jtabla[filas];j++){
                
                    }
                  }*/
                 System.out.print(tabla[filas][columnas]+" ");
                }
            }
            System.out.println("");
       
        
    }//cierre main
    
} //cierre class