package aplicacionpunto;

import java.util.Scanner;

public class Punto {
    private double x;
    private double y;
    private static int contador=0;
    
    public Punto () {
        this.contador++;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
        this.contador++;
    }
    public Punto (Punto p){
        this.x = p.x;
        this.y = p.y;
        this.contador++;
    }
    public void pidePunto(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coordenada X= ");
        this.setX(sc.nextDouble());
        sc.nextLine();
        System.out.print("Coordenada Y= ");
        this.setY(sc.nextDouble());
        sc.nextLine();
    }
    @Override
    public String toString(){
        String resultado;
        resultado = "\n("+this.getX()+","+this.getY()+")";
        return resultado;
    }
    public double distancia(Punto p){
    double d,base,altura;
    base = this.getX() - p.getX();
    altura = this.getY() - p.getY();
    d = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
    return d;
    }
    public static double area(Punto p1, Punto p2, Punto p3){
        double superficie;
        double a,b,c, p;
        a = p1.distancia(p2);
        b = p2.distancia(p3);
        c = p3.distancia(p1);
        p = (a + b +c)/2;
        superficie = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return superficie;
    }

    
    //gets y sets
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

}
