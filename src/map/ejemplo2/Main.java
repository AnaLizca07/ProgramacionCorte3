package map.ejemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Ropita> ropitas = Arrays.asList(
                new Ropita("Top",25000),
                new Ropita("Pantalon",80000)
        );

        List<Double> subirPrecio = ropitas.stream()
                .map(r -> r.getPrecio() + r.getPrecio()*0.2)
                .collect(Collectors.toList());
        System.out.println(subirPrecio);
    }
}
