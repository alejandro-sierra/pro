package aplicacion4215;

//(int) (Math.ramdom()*(max-min))

public class Aplicacion4215 {

    public static void main(String[] args) {
        int numero=0, mayor=0, menor=0;
        for (int i=1;;i++){
            numero = (int)(Math.random()*(50+50-1)-1)+-50;
            if (i==1){
            mayor = numero;
            menor = numero;
            }else if (numero > mayor){
            mayor = numero;
            }else if (numero < menor){
            numero = menor;
            }
            
            System.out.print(numero+" ");
            if (numero==25 || numero==-25){
                break;
            }
        }
            System.out.println("");
           System.out.println("mayor= "+mayor+" menor= "+menor);
    }
    
}
