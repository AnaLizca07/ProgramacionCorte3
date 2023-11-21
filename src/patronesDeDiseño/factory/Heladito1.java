package patronesDeDiseño.factory;

public class Heladito1 implements Helado{
    @Override
    public void mostrarSabores() {
        System.out.println("Chocolate y vainilla");
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("Este helado cuesta: $3.500");
    }
}
