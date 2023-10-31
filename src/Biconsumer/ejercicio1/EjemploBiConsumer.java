package Biconsumer.ejercicio1;

import java.util.function.BiConsumer;

public class EjemploBiConsumer {
    public static void main(String[] args) {

        ProductoI productoI = new ProductoI("Galletas", 500, "Refrigerados");
        Categoria categoria = new Categoria("Dulces");




        BiConsumer<ProductoI,Categoria > biConsumer = (pro,cat) -> pro.setTipoCategoria(cat.getTipoCategoria());
        biConsumer.accept(productoI, categoria);

        System.out.println("Nombre: " + productoI.getNombre());
        System.out.println("Precio: " + productoI.getPrecio());
        System.out.println("Categoria: " + productoI.getTipoCategoria());


    }
}
