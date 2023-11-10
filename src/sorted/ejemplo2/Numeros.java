package sorted.ejemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(9,34,65,1,0,764,82653,9098754);

        List<Integer> sortedNumeros = numeros.stream()
                .filter(x-> x<84000)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumeros);
    }
}
