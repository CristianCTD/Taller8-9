package transporte;

public class TestTransporte {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Toyota", 180);
        Coche c = new Coche("Mazda", 220, 4);

        v.mostrarDetalles();
        c.mostrarDetalles();
    }
}
