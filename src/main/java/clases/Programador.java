package clases;

public class Programador extends Empleado {

    private int experiencia;
    private String lenguajeDominante;

    public Programador() {

    }

    public Programador(int experiencia, String lenguajeDominante, int edad, String nombre, double salario) {
        super(edad, nombre, salario);
        this.experiencia = experiencia;
        this.lenguajeDominante = lenguajeDominante;
    }

    public double bonificacion() {

        if (experiencia <= 2) {

            return 0;
        } else if (experiencia > 2 && experiencia <= 4) {

            return 0.08 * super.getSalario();
        } else {

            return 0.12 * super.getSalario();
        }
    }

    public double pagoTotal() {

        return super.getSalario() + bonificacion();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

}
