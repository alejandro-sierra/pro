package profesores;

import java.util.Scanner;

public class Profesor {
    private static String curso;
    private static double pagoPorHorasExtra;
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int[] horasExtra = new int[12];
    private double tipoIRPF;
    

    public static void nuevoProfesor(Profesor p){
        Scanner sc = new Scanner(System.in);
        
    }

/*
    public Profesor(String dni, String nombre, double sueldoBase, double tipoIRPF) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.tipoIRPF = tipoIRPF;
    }
  
*/
    
    public double calcularImporteHorasExtra(int mes){
        return horasExtra[mes]*pagoPorHorasExtra;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Getter and Setter
    public static String getCurso() {
        return curso;
    }

    public static void setCurso(String curso) {
        Profesor.curso = curso;
    }

    public static double getPagoPorHorasExtra() {
        return pagoPorHorasExtra;
    }

    public static void setPagoPorHorasExtra(double pagoPorHorasExtra) {
        Profesor.pagoPorHorasExtra = pagoPorHorasExtra;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int[] getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int[] horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }
    
    
}

