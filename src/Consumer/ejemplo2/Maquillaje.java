package Consumer.ejemplo2;

public class Maquillaje {
    private String nombre;
    private Integer precio;
    private String tipoPiel;
    private Integer cantidad;

    public Maquillaje(String nombre, Integer precio, String tipoPiel, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoPiel = tipoPiel;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Maquillaje{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
