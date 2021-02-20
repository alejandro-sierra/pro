package herencia01;

import java.util.Scanner;

public class Alumno extends Persona {

    private String curso;
    private String fechaNacimiento;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String domicilio, String codigoPostal, String cuidad, String telefono,
            String email, String curso, String fechaNacimiento) {
        super(dni, nombre, domicilio, codigoPostal, cuidad, telefono, email);
        this.curso = curso;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void pideDatos() {
        Scanner sc = new Scanner(System.in);
        super.pideDatos();
        System.out.print("Curso: ");
        curso = sc.nextLine();
        System.out.print("Fecha nacimiento: ");
        fechaNacimiento = sc.nextLine();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nCurso: ");
        sb.append(curso);
        sb.append("\nFecha nacimieto: ");
        sb.append(fechaNacimiento);
        return sb.toString();
    }

    //getters and setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
