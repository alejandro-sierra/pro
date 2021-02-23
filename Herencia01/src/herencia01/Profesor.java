package herencia01;

import java.util.Scanner;

public class Profesor extends Persona {

    private String cuenta;
    private String especialidad;

    public Profesor() {
        super();
    }

    public Profesor(String cuenta, String especialidad, String dni, String nombre, String domicilio,
            String codigoPostal, String cuidad, String telefono, String email) {
        super(dni, nombre, domicilio, codigoPostal, cuidad, telefono, email);
        this.cuenta = cuenta;
        this.especialidad = especialidad;
    }

    @Override
    public void pideDatos() {
        Scanner sc = new Scanner(System.in);
        super.pideDatos();
        System.out.print("Cuenta: ");
        cuenta = sc.nextLine();
        System.out.print("Especialidad: ");
        especialidad = sc.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("****PROFESOR****");
        sb.append(super.toString());
        sb.append("\nCuenta: ");
        sb.append(cuenta);
        sb.append("\nEspecialidad: ");
        sb.append(especialidad);
        return sb.toString();
    }

    //getters and setters
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
