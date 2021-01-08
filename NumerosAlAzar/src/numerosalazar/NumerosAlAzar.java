package numerosalazar;

public class NumerosAlAzar {

    public static void main(String[] args) {
        int n;
        int min = 20;
        int max = 300;
        //min = 20 
        for (int i = 1;i<=100;i++){
        n = (int) (Math.random()*(max-min+1))+min;
        System.out.println(n);
        }

    }
    
}
