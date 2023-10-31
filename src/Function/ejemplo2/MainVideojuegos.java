package Function.ejemplo2;

import java.util.function.Function;

public class MainVideojuegos {
    public static void main(String[] args) {
        Videojuegos videojuegos = new Videojuegos("Mario Kart","Carreras",190000,"Nintendo y Wii");
        Function<Videojuegos,String> verConsolas = x -> "El videojuego " + x.getNombre() + " puede jugarse en " + x.getConsolas();

        System.out.println(verConsolas.apply(videojuegos));
    }
}
