package arreglos01;

public class Arreglos01 {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elementos " + i + ": " + edades[i]);
            //i aqui vale lo que vale en el for
        }
    }

}
