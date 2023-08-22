public class Ovni extends Volador implements PistaAterrizaje{
    private String origen;
    private int vacasAbducidas;

    public Ovni(String nombre, String origen, int vacasAbducidas) {
        super(nombre);
        this.origen = origen;
        this.vacasAbducidas = vacasAbducidas;
    }


    @Override
    public void aterrizado() {
        System.out.println("Ovni aterrizo correctamente");
    }

    @Override
    public String toString() {
        return "Ovni{" +
                "nombre=" + nombre +
                ", origen='" + origen + '\'' +
                ", vacasAbducidas=" + vacasAbducidas +
                '}';
    }
}
