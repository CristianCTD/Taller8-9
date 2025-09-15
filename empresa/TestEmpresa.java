package empresa;

public class TestEmpresa {
    public static void main(String[] args) {
        Empleado e = new Empleado("Sofía", 3000.0);
        Gerente g = new Gerente("Andrés", 5000.0, "Ventas");

        e.mostrarDetalles();
        g.mostrarDetalles();
    }
}
