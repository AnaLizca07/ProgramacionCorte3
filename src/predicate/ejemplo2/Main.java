package predicate.ejemplo2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(false);

        Predicate<Semaforo> isOn = Semaforo::isOn;
        if(isOn.test(semaforo)){
            System.out.println("El semaforo esta readyyy");
        } else {
            System.out.println("El semaforo no esta ready :(");
        }
    }
}
