public class Superman extends Volador implements PistaAterrizaje{

    private String identidad;
    private String rol;

    public Superman(String nombre, String identidad, String rol) {
        super(nombre);
        this.identidad = identidad;
        this.rol = rol;
    }

    @Override
    public void aterrizado() {
        System.out.println("Superman aterrizo correctamente");
    }

    @Override
    public String toString() {
        return "Superman{" +
                "nombre=" + nombre +
                ", identidad='" + identidad + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
