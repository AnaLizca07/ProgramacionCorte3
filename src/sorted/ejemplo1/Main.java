package sorted.ejemplo1;

import sorted.ejemplo1.Colores;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Colores> coloresList = Arrays.asList(
                new Colores("Azul",123),
                new Colores("Blanco",000),
                new Colores("Amarillo",986)
        );

        List<String> nColores = coloresList.stream()
                .map(n -> n.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nColores);
    }

}
