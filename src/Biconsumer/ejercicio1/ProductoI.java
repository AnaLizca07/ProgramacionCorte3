package Biconsumer.ejercicio1;

public class ProductoI {
    private String nombre;
    private double precio;

    private String tipoCategoria;

    public ProductoI(String nombre, double precio, String tipoCategoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoCategoria = tipoCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}
