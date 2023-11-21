package patronesDeDiseño.factory;

public class HeladitosFactory {
    public static Helado getHelado(String tipo){
        if(tipo.equals("Heladito 1")){
            return new Heladito1();
        } else if (tipo.equalsIgnoreCase("Heladito 2")) {
            return new Heladito2();
        }
        return null;
    }
}
