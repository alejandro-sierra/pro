package aplicaion4220;

import java.util.Scanner;

public class Aplicaion4220 {
    static Scanner sc = new Scanner(System.in); //al ser global puedo usarla en todos los metodos
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int opcion;
        boolean correcto = true;
        do{
            System.out.println("**********CALCULO AERA DIGURA GEOMETRICA**********");
            System.out.println("              1.TRIANGULO");
            System.out.println("              2.RECTANGULO");
            System.out.println("              3.CIRCULO");
            System.out.println("              4.SALIR");
            System.out.print("          Opcion Seleccionada:  ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    calculaTriangulo();
                    break;
                case 2:
                    calculaRectangulo();
                    break;
                case 3:
                    calculaCirculo();
                    break;
                default:
                    correcto = false;
                    break;
            }
        }while (correcto=true);
    }
public static void calculaTriangulo(){
double base,altura,area;
    System.out.print("Base: "); base=sc.nextDouble();
    sc.nextLine();
    System.out.print("Altura: "); altura=sc.nextDouble();
    sc.nextLine();
    area = base*altura/2;
    System.out.println("El area del triangulo de base "+base+ " y altura "
            +altura+ " vale "+area);
}
public static void calculaRectangulo(){
double base,altura,area;
    System.out.print("Base: "); base=sc.nextDouble();
    sc.nextLine();
    System.out.print("Altura: "); altura=sc.nextDouble();
    sc.nextLine();
    area = base*altura;
    System.out.println("El area del rectangulo de base "+base+ " y altura "
            +altura+ " vale "+area);
}
public static void calculaCirculo(){
double radio,area;
    System.out.print("Radio: "); radio=sc.nextDouble();
    area = Math.pow(radio, 2)/2;
    System.out.println("El area del circulo de radio "+radio+" vale "+area);
}
    
}
