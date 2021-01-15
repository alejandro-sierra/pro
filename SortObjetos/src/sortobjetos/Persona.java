package sortobjetos;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private int altura;

    public Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

/*
    @Override
    //ordenar por altura
    public int compareTo(Persona t) {
        if(altura<t.altura){
            return -1;
        }
        if(altura>t.altura){
            return 1;
        }
        return 0;
    }
*/

    @Override
    //ordenar por altura
    public int compareTo(Persona t) {
        if(nombre.compareTo(nombre)<0){
            return -1;
        }
        if(nombre.compareTo(nombre)<0){
            return 1;
        }
        return 0;
    }
    
    
//getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
}
