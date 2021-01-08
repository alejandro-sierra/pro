package aplicaion428;

public class Aplicaion428 {

    public static void main(String[] args) {
        int numero;
        for (int i =1;i<=200;i++){
            numero = (int) (Math.random()*(9999-1000))-1 +1000;
            System.out.println(numero);
        }
            
    }
    
}
