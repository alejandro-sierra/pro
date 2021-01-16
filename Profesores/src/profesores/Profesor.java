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
    

    public static void nuevoProfesor(){
        
    }

    public double calcularImporteHorasExtra(int mes){
        return horasExtra[mes]*pagoPorHorasExtra;
    }
    
    public double calcularSueldoBruto(int mes){
        return sueldoBase+calcularImporteHorasExtra(mes);
    }
    
    public double calcularRetencionesIrpf(int mes){
        return calcularSueldoBruto(mes) *tipoIRPF/100;
    }
    
    public double calcularSueldo(int mes){
        return calcularSueldoBruto(mes)-calcularRetencionesIrpf(mes);
    }
    
    
    public void ImprimeProfesor(int mes){
//        return "\nNombre: "+this.nombre+
//                "\nDNI: "+this.dni+
//                "\nSueldo: "+this.calcularSueldo(mes)+
//                "\nTipo IRPF: "+this.tipoIRPF;
        System.out.println("Nombre: "+this.nombre);
        System.out.println("DNI: "+this.dni);
        System.out.println("Sueldo Base: "+this.calcularSueldo(mes));
        System.out.println("Tipo IRPF: "+this.tipoIRPF);
    }
    
    public void leerProfesor(){
        Scanner sc = new Scanner(System.in);
        String nombre, dni;
        double sueldoBase, tipoIRPF;
        System.out.print("Nombre: ");nombre=sc.nextLine();
        System.out.print("DNI: ");dni=sc.nextLine();
        System.out.print("Sueldo Base: ");sueldoBase=sc.nextDouble();
        System.out.print("Tipo IRPF: ");tipoIRPF=sc.nextDouble();
        this.setNombre(nombre);
        this.setDni(dni);
        this.setSueldoBase(sueldoBase);
        this.setTipoIRPF(tipoIRPF);
        System.out.println("");
    }
    
    public void imprimirNomina(int mes){
        
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

