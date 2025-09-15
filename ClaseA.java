class ClaseA {}
class ClaseB {}
//Uso incorrecto de la herencia


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
//Uso correcto de la herencia