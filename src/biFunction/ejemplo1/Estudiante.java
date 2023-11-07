package biFunction.ejemplo1;

public class Estudiante {
    private String nombre;
    private String carrera;
    private String clase;

    public Estudiante(String nombre, String carrera, String clase) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
