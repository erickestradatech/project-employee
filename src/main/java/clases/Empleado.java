package clases;

public class Empleado {

    private int edad;
    private String nombre;
    private double salario;

    static int codigo;

    public Empleado() {

    }

    public Empleado(int edad, String nombre, double salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;

        codigo++;
    }

    public String calificacion() {

        if (edad <= 21) {

            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {

            return "Intermedio";
        } else {

            return "Senior";
        }

    }

    @Override
    public String toString() {

        return "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nSalario: " + salario;
    }

    public void aumentarSalario(int p) {

        salario = salario + salario * p / 100;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
