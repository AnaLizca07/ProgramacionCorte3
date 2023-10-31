package Function.ejemplo2;

public class Videojuegos {
    private String nombre;
    private String categoría;
    private Integer precio;
    private String consolas;

    public Videojuegos(String nombre, String categoría, Integer precio, String consolas) {
        this.nombre = nombre;
        this.categoría = categoría;
        this.precio = precio;
        this.consolas = consolas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getConsolas() {
        return consolas;
    }

    public void setConsolas(String consolas) {
        this.consolas = consolas;
    }
}
