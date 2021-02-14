package profesorarraylist;

import java.util.Scanner;

public class Profesor {

    private static String curso;
    private static double pagoPorHorasExtra;
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int[] horasExtra = new int[12];
    private double tipoIRPF;

    Profesor() {

    }

    public Profesor(String dni, String nombre, double sueldoBase, double tipoIRPF) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.tipoIRPF = tipoIRPF;
    }

    public void nuevoProfesor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNombre: ");
        this.nombre = sc.nextLine();
        System.out.print("DNI: ");
        this.dni = sc.nextLine();
        System.out.print("Sueldo Base: ");
        this.sueldoBase = sc.nextDouble();
        System.out.print("Tipo IRPF: ");
        this.tipoIRPF = sc.nextDouble();
    }

    public double calcularImportePorHorasExtra(int mes) {
        return pagoPorHorasExtra * horasExtra[mes];
    }

    public double calcularSueldoBruto(int mes) {
        return sueldoBase + calcularImportePorHorasExtra(mes);
    }

    public double calcularRetencionIRPF(int mes) {
        return calcularSueldoBruto(mes) * tipoIRPF / 100;
    }

    public double calcularSueldo(int mes) {
        return calcularSueldoBruto(mes) - calcularRetencionIRPF(mes);
    }

    public String imprimir() {
        String resultado
                = "Nombre: " + nombre
                + "\nDNI: " + dni
                + "\nSueldo Base: " + sueldoBase
                + "\nTipo IRPF: " + tipoIRPF + "\n";
        return resultado;
    }

    public String imprimirNomina(int mes) {
        String nombreMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        return "\nNombre: " + nombre
                + "\nDNI: " + dni
                + "\nCurso: " + curso + "     Nomina del mes " + nombreMes[mes - 1]
                + "\nHoras extra: : " + horasExtra[mes]
                + "\nTipo IRPF: " + tipoIRPF
                + "\nSueldo bruto: " + calcularSueldoBruto(mes)
                + "\nRetenciones por IRPF: " + calcularRetencionIRPF(mes)
                + "\nSueldo neto: " + calcularSueldo(mes) + "\n";
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

    public int getHorasExtra(int mes) {
        return horasExtra[mes];
    }

    public void setHorasExtra(int mes, int horas) {
        this.horasExtra[mes] = horas;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public int compareTo(Profesor p) {
        if (nombre.compareTo(p.nombre) < 0) {
            return -1;
        }
        if (nombre.compareTo(p.nombre) > 0) {
            return 1;
        }
        return 0;
    }

}
