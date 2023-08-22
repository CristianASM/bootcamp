public class Avion extends Volador implements PistaAterrizaje{

    private float longitud;
    private int cantidadAsientos;

    public Avion(String nombre, float longitud, int cantidadAsientos) {
        super(nombre);
        this.longitud = longitud;
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public void aterrizado() {
        System.out.println("Avion aterrizo correctamente");
    }

    @Override
    public String toString() {
        return "Avion{" +
                "nombre=" + nombre +
                ", longitud=" + longitud +
                ", cantidadAsientos=" + cantidadAsientos +
                '}';
    }
}
