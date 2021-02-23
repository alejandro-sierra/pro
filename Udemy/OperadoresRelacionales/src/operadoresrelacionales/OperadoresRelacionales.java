package operadoresrelacionales;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        boolean c = (a == b); //a es igual a b?
        System.out.println("c = " + c);

        var d = (a != b); //a es diferente de b
        System.out.println("d = " + d);

        String cadena01 = "hola";
        var cadena02 = "hola";

        boolean e = cadena01 == cadena02; //comparamos referencias de los objetos
        System.out.println("e = " + e);

        var f = cadena01.equals(cadena02); //compara el contenido de los Strings
        System.out.println("f = " + f);

        boolean g = a >= b; //mayor que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es un numero impar");
        }

        int edad = 30;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");   
        }
    }
}
