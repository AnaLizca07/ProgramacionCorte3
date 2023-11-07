package biFunction.ejemplo2;

import java.util.function.BiFunction;

public class Numeros {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sumaNumeros = (x,y)-> x+y;
        int sumita = sumaNumeros.apply(90,85);
        System.out.println("La sumita de 90 y 85 es: "+ sumita);
    }
}
