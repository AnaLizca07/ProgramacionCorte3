package supplier.ejemplo1;

import java.util.function.Supplier;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Veronica");
        Supplier<String> nombreSupplier = cliente::getNombre;
        String nombreCliente = nombreSupplier.get();
        System.out.println("Nombre del cliente: "+nombreCliente);
    }
}
