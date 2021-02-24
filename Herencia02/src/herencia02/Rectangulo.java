package herencia02;

import java.util.Scanner;

public class Rectangulo extends Figura {

    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo(double lado1, double lado2, String color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return lado1*lado2;
    }

    @Override
    public void pideDatos() {
        Scanner sc = new Scanner(System.in);
        super.pideDatos();
        System.out.println("Lado 1: ");
        lado1 = sc.nextDouble();
        sc.nextDouble();
        System.out.println("Lado 2: ");
        lado2 = sc.nextDouble();
        sc.nextDouble();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        //sb.append(super.toString()); se puede poner asi o como arriba
        sb.append("\nLado 1:");
        sb.append(lado1);
        sb.append("\nLado 2:");
        sb.append(lado2);
        return  sb.toString();
    }
    
    //getters and setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

}
