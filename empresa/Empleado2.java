package empresa;

public class Empleado2 extends Persona2 {
    private String departamento;

    public Empleado2(String nombre, int edad, String departamento) {
        super(nombre, edad); 
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

