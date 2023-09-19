import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito(); //Instancia de la clase para usar los metodos.
        //Productos de prueba
        ProductoAlmacen producto1 = new ProductoAlmacen("Papas", 1569.6, "Vegetales");
        ProductoAlmacen producto2 = new ProductoAlmacen("Leche", 358.5, "Lacteos");
        ProductoAlmacen producto3 = new ProductoAlmacen("Pan", 200.0, "Panaderia");
        ProductoAlmacen producto4 = new ProductoAlmacen("Tomate", 154.0, "Vegetales");
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);

        int opcion = 0;

        while (opcion < 1 || opcion > 4){
            System.out.println("Ingrese su opcion:");
            System.out.println("1- Agregar producto");
            System.out.println("2- Ver la cantidad de productos");
            System.out.println("3- Importe total");
            System.out.println("4- Ver carrito");
            try{
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        try{
                            System.out.println("Ingrese el nombre del producto:");
                            String nombre = scanner.next();
                            System.out.println("Ingrese el precio del producto:");
                            double precio = scanner.nextDouble();
                            if(precio <= 0){
                                System.out.println("Error: El precio tiene que ser mayor a cero");
                                return;
                            }
                            System.out.println("Ingrese la categoría del producto:");
                            String categoria = scanner.next();

                            ProductoAlmacen nuevoProducto = new ProductoAlmacen(nombre, precio, categoria);
                            carrito.agregarProducto(nuevoProducto);

                        }catch(InputMismatchException e){
                            System.out.println("Error: Valores incorrectos, por favor verifica los datos.");
                        }
                        break;
                    case 2:
                        System.out.println("Tiene " + carrito.cantidadProductos() + " productos en el carro");
                        break;
                    case 3:
                        System.out.println("TOTAL: " + carrito.importeTotal());
                        break;
                    case 4:
                        carrito.verCarrito();
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Seleccione un numero del 1 al 4");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
