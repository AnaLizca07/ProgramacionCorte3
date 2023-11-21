package patronesDeDiseño.factory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Helado h1 = HeladitosFactory.getHelado("heladito 2");
        Objects.requireNonNull(h1).mostrarSabores();
        Objects.requireNonNull(h1).mostrarPrecio();

        Helado h2 = HeladitosFactory.getHelado("Heladito 1");
        Objects.requireNonNull(h2).mostrarSabores();
        Objects.requireNonNull(h2).mostrarPrecio();

    }
}
