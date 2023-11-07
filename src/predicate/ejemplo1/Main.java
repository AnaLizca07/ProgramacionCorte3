package predicate.ejemplo1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Personita personita1 = new Personita("Ana", true);
        Personita personita2 = new Personita("Sebastian", false);

        Predicate<Personita> disponible = Personita::isDisponible;
        System.out.println("La personita 1 esta activo: " + disponible.test(personita1));
        System.out.println("La personita 2 esta activo: " + disponible.test(personita2));
    }
}
