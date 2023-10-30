package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EjConsumer {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Chocolatina",1000));
        productos.add(new Producto("Galletas",500));
        productos.add(new Producto("Doritos", 2000));

        Consumer<List<Producto>> consumer = (listaproductos) -> {
            for (Producto producto : listaproductos) {
                System.out.println("El producto elegido es " + producto.getNombre() + " y su costo es de " + producto.getPrecio());
            }
        };
        consumer.accept(productos);
    }
}
