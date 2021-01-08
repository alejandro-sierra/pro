package aplicacionpunto;

public class AplicacionPunto {

    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        Punto p4 = new Punto();
        Punto p5 = new Punto();
        p1.pidePunto();
        p2.pidePunto();
        p1.toString();
        p2.toString();
        p3.pidePunto();
        double distancia = p1.distancia(p2);
        System.out.println("distancia" + distancia);
        
        //area entre p1, p2, p3
        double area = Punto.area(p1,p2,p3);
        System.out.println("El area del triangulo comprendido entre los puntos " 
    + p1.toString() + " , " + p2.toString() + " y " + p3.toString() + " vale " + area);
    }
    
}
