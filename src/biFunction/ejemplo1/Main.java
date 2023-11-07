package biFunction.ejemplo1;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan","Software",null);
        Profesor profesor = new Profesor("Arle","Programacion");

        BiFunction<Estudiante,Profesor,String> asignacionClase = (e,p)->{
            e.setClase("Programacion I");
            return "El maestro " + p.getNombre() + " ha sido asignado para dictar la clase de "+ e.getClase() + " a " + e.getNombre();
        };
        System.out.println(asignacionClase.apply(estudiante,profesor));
    }
}
