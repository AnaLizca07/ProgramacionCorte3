package patronesDeDiseño.singleton;

public class Pelicula {
    private static Pelicula instancia;
    private String titulo;
    private String actorPrincipal;
    private Integer duracion;

    private Pelicula(){}

    public static Pelicula getInstance(){
        if(instancia==null){
            instancia = new Pelicula();
        }
        return instancia;
    }

    public static Pelicula getInstancia() {
        return instancia;
    }

    public static void setInstancia(Pelicula instancia) {
        Pelicula.instancia = instancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
}
