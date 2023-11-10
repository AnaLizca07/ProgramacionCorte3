package filter.ejemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Videojuegos> videojuegos = Arrays.asList(
                new Videojuegos(1,"Mario Kart","Carreras",180000),
                new Videojuegos(2,"Mario Odissey","Aventura",200000),
                new Videojuegos(3,"Smash Bross","Pelea",150000),
                new Videojuegos(4,"Luigi`s Manssion","Aventura",128000)
        );

        List<Videojuegos> filtroPrecio = videojuegos.stream()
                .filter(prize -> prize.getPrecio() <= 150000)
                .collect(Collectors.toList());
        filtroPrecio.forEach(l -> System.out.println(l.getNombre()+"\n"+l.getId()+"\n"+l.getCategoria()+"\n"+l.getPrecio()));
    }
}
