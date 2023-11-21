package patronesDeDiseño.singleton;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = Pelicula.getInstance();

        pelicula.setTitulo("Rapidos y furiosos");
        pelicula.setActorPrincipal("Vin Diesel");
        pelicula.setDuracion(123456);

        System.out.println("La pelicula se llama: "+pelicula.getTitulo()+"\nSu actor principal es: "+pelicula.getActorPrincipal()+"\nLa pelicula dura: "+ pelicula.getDuracion());
    }
}
