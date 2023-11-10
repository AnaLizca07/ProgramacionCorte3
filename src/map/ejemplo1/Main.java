package map.ejemplo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Profesor> profesors = Arrays.asList(
                new Profesor(12345,"Jessica",1250000,"Fisica"),
                new Profesor(4567,"Trujillo",1350000,"Calculo")
        );

        List<String> materias = profesors.stream()
                .map(profes -> profes.getMateria().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(materias);
    }
}
