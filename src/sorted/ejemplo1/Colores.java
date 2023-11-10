package sorted.ejemplo1;

public class Colores {
    private String nombre;
    private int referencia;

    public Colores(String nombre, int referencia) {
        this.nombre = nombre;
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
}
