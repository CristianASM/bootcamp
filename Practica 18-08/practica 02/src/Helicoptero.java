public class Helicoptero extends Volador implements PistaAterrizaje{

    private String color;
    private String modelo;

    public Helicoptero(String nombre, String color, String modelo) {
        super(nombre);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public void aterrizado() {
        System.out.println("Helicoptero aterrizo correctamente");
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "nombre=" + nombre +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
