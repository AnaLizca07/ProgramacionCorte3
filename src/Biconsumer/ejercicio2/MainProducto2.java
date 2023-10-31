package Biconsumer.ejercicio2;

import java.util.function.BiConsumer;

public class MainProducto2 {
    public static void main(String[] args) {
        Producto2 producto2 = new Producto2("Barrilete",500,"Delicioso dulce");
        CaracterísticaNueva característicaNueva = new CaracterísticaNueva("Dulce sabor cocacola");

        BiConsumer<CaracterísticaNueva,Producto2> biConsumer = (caract,pro2) -> pro2.setCaracterísticas(caract.getNuevaCaracterística());
        biConsumer.accept(característicaNueva,producto2);

        System.out.println("Nombre: "+producto2.getNombre()+"\nPrecio: "+ producto2.getPrecio()+"\nCaracterística : "+producto2.getCaracterísticas());
    }
}
