package supplier.ejemplo2;

import java.util.function.Supplier;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Supplier<Double> aleatoriosNumeros = ()-> (Double) (Math.random()*38);
        Double randomNumer = aleatoriosNumeros.get();
        System.out.println("El numero aleatorio es: "+randomNumer);
    }
}
