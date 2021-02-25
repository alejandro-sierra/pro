package herencia02;

import java.util.Scanner;

public class Circulo extends Figura {

    static Scanner sc = new Scanner(System.in);
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        double  a= Math.pow((3.1415 * radio),2);
        return a;
    }

    @Override
    public void pideDatos() {
        super.pideDatos();
        System.out.print("Radio: ");
        radio = sc.nextDouble();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nReadio: ");
        sb.append(radio);
        return sb.toString();
        }
    

    //getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
