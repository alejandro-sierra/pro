package sortobjetos;

import java.util.Arrays;

public class SortObjetos {

    public static void main(String[] args) {
        Persona [] arraysPersonas = new Persona[5];
        arraysPersonas[0] = new Persona ("Mario",22,187);
        arraysPersonas[1] = new Persona ("Pepe",52,173);
        arraysPersonas[2] = new Persona ("Manuel",27,158);
        arraysPersonas[3] = new Persona ("David",25,164);
        arraysPersonas[4] = new Persona ("Alberto",80,184);
        imprimir(arraysPersonas);
        System.out.println("");
        Arrays.sort(arraysPersonas);
        imprimir(arraysPersonas);

        
    }
    public static void imprimir(Persona[] lista){
        for(Persona valor: lista){
            System.out.println(valor.getNombre()+" , "+valor.getEdad()
                    +" , "+valor.getAltura());
        }
    }
}
