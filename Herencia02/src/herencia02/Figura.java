package herencia02;

import java.util.Scanner;

public abstract class Figura {

    private String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public void pideDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Color: ");
        color = sc.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nColor: ");
        sb.append(color);
        System.out.println("");
        return sb.toString();
    }

    public abstract double area();
}
