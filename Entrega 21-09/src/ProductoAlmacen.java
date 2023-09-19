public class ProductoAlmacen extends Producto implements IAgregarIVA{
    private String categoria;
    public ProductoAlmacen(String nombre, double precio, String categoria) {
        super(nombre, precio);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public double agregarIVA() {
        double iva = getPrecio() * 0.19;
        double precioFinal = getPrecio() + iva;
        return precioFinal;
    }
}
