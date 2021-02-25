package herencia02;

import java.util.Scanner;

public class Triangulo extends Figura {

    static Scanner sc = new Scanner(System.in);
    private double lado1, lado2, lado3;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3, String color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void pideDatos() {
        super.pideDatos();
        System.out.print("Lado 1: ");
        lado1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        lado3 = sc.nextDouble();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nLado 1: ");
        sb.append(lado1);
        sb.append("\nLado 2: ");
        sb.append(lado2);
        sb.append("\nLado 3: ");
        sb.append(lado3);
        return sb.toString();
    }

    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        double s = Math.sqrt(p*(p*lado1)*(p*lado2)*(p*lado3));
        return s;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

}
