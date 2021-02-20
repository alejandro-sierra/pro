package herencia01;

import java.util.Scanner;

public class Persona {

    private String dni;
    private String nombre;
    private String domicilio;
    private String codigoPostal;
    private String cuidad;
    private String telefono;
    private String email;

    public Persona() {
    }

    public Persona(String dni, String nombre, String domicilio,
            String codigoPostal, String cuidad, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
        this.cuidad = cuidad;
        this.telefono = telefono;
        this.email = email;
    }

    public void pideDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        dni = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Domiciolio: ");
        domicilio = sc.nextLine();
        System.out.print("Codigo Postal: ");
        codigoPostal = sc.nextLine();
        System.out.print("Ciudad: ");
        cuidad = sc.nextLine();
        System.out.print("Telefono: ");
        telefono = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDNI: ");
        sb.append(dni);
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nDomicilio: ");
        sb.append(domicilio);
        sb.append("\nCodigo Postal: ");
        sb.append(codigoPostal);
        sb.append("\nCuidad: ");
        sb.append(cuidad);
        sb.append("\nTelefono: ");
        sb.append(telefono);
        sb.append("\nEmail: ");
        sb.append(email);
        return sb.toString();
    }

    //getters and setters
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
