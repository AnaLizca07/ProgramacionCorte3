package patronesDeDiseño.factory;

public class Heladito2 implements Helado{
    @Override
    public void mostrarSabores() {
        System.out.println("Ron con pasas y chocolate");
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("Este helado cuesta: $4.000");
    }
}
