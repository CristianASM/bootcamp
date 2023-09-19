import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ProductoAlmacen> productos = new ArrayList<>();

    public void agregarProducto(ProductoAlmacen producto){
        productos.add(producto);
        System.out.println("Producto agregado correctamente -> " + producto);
    }
    public int cantidadProductos(){
        return productos.size();
    }
    public String importeTotal() {
        double importeTotal = 0;
        for (ProductoAlmacen producto : productos) {
            importeTotal += producto.agregarIVA();
        }
        String totalDosDecimales = String.format("%.2f", importeTotal);
        return totalDosDecimales; //Calcula el IVA a cada producto y el total lo deja con 2 decimales.
    }
    public void verCarrito(){
        if(productos.isEmpty()){
            System.out.println("No hay productos en el carro de compras");
            return;
        }
        for (ProductoAlmacen producto: productos){
            System.out.println(producto);
        }
    }

}
