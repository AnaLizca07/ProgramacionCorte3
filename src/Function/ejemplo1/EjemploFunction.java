package Function.ejemplo1;


import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
       ProductoII productoII = new ProductoII("Doritos" , 2000 , "Papas fritas");

        Function<ProductoII,String> mostrarPrecio = x -> "El producto " + x.getNombre() + " tiene un precio de " + x.getPrecio();

        System.out.println(mostrarPrecio.apply(productoII));
    }
}
