package seleccion;

public class Seleccion {

    public static void main(String[] args) {
        int numeros[] = {8,7,2,1,8,8,9,10,11,3,4,5,7};
        int menor=0,pos=0,aux=0;
                //for each
        for(int valor: numeros){
            System.out.print(valor+" ");
        }
        System.out.println("");
        System.out.println("");

        
        for(int i=0;i<numeros.length;i++){
            //i es la posicion donde colocaremos el mas pequeño
            menor = numeros[i];
            pos=i;
            for(int j=i+1;j<numeros.length;j++){
                if(numeros[j]<menor){//el menor de la serie, de momento, es este
                    pos=j;
                    menor = numeros[j];
                }
            }
            if(pos!=i){//ha en =contrado uno mas pequeño
                aux = numeros[pos];
                numeros[pos]=numeros[i];
                numeros[i]=aux;
            }
        }
        //for each
        for(int valor: numeros){
            System.out.print(valor+" ");
        }
        System.out.println("");
    }//cierre class
    
}//cierre metodo
