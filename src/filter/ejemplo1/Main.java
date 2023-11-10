package filter.ejemplo1;

import filter.ejemplo1.Estudiante;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> lista = Arrays.asList(
                new Estudiante("Sebastian",20,194891234,"Ingenieria de software"),
                new Estudiante("Juan",18,109876542,"Medicina"),
                new Estudiante("Sofia",19,1928653,"Psicologia")
        );

        List<Estudiante> eCarrera = lista.stream()
                .filter(x -> x.getCarrera().startsWith("I"))
                .collect(Collectors.toList());
        eCarrera.forEach(p -> System.out.println(p.getName()+"\n"+p.getCarrera()+"\n"+p.getCedula()+"\n"+p.getEdad()));

    }
}
