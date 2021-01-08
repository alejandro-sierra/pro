    package buclesanidados;

public class BuclesAnidados {

    public static void main(String[] args) {
        /* for (int filas =1; filas <=6; filas++){
            for (int columnas =1; columnas <=10; columnas++){
                System.out.print("(" + filas + ", " + columnas +")" );

            }
            System.out.println("");
            //aqui salta de linea
        }*/
       for (int filas =1; filas <=6; filas++){
            for (int columnas =1; columnas <=10; columnas++){
                //System.out.print("(" + filas + ", " + columnas +")" );
                   if (filas ==1 || filas ==6 || columnas ==1 || columnas ==10) {
                       System.out.print("*");
                   }else {System.out.print(" ");}
            }
            System.out.println("");
            //aqui salta de linea
        } 
           
    }
    
}
