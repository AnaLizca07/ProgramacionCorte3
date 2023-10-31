package Consumer.ejemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainMaquillaje {
    public static void main(String[] args) {
        List<Maquillaje> maquillajes = new ArrayList<>();
        maquillajes.add(new Maquillaje("Polvo Suelto",35000,"Piel grasa a mixta",5));
        maquillajes.add(new Maquillaje("Sombras",56000,"Pieles secas",8));
        maquillajes.add(new Maquillaje("Labial",6000,"Todo tipo de piel",3));

        Consumer<List<Maquillaje>> consumer = (listamaquillaje)-> {
            for (Maquillaje maquillaje : listamaquillaje){
                System.out.println("El producto seleccionado es: " + maquillaje.getNombre()+"\nPrecio: "+ maquillaje.getPrecio()+"\nTipo de piel: "+maquillaje.getTipoPiel()+"\nCantidad: " + maquillaje.getCantidad());
            }
        };
        consumer.accept(maquillajes);
    }
}
