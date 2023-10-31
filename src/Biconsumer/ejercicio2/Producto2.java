package Biconsumer.ejercicio2;

public class Producto2 {
    private String nombre;
    private Integer precio;
    private String características;

    public Producto2(String nombre, Integer precio, String características) {
        this.nombre = nombre;
        this.precio = precio;
        this.características = características;
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

    public String getCaracterísticas() {
        return características;
    }

    public void setCaracterísticas(String características) {
        this.características = características;
    }
}
