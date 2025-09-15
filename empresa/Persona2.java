package empresa;

public class Persona2 {
    protected String nombre;
    protected int edad;

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
