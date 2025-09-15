public class Main {
    public static void main(String[] args) {
    }
}
//Uso incorrecto de super al no usar herencia

class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
    }
}
//aqui super falla al no poder obtener contenido privado