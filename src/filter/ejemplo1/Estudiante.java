package filter.ejemplo1;

public class Estudiante {
    private String name;
    private int edad;
    private int cedula;
    private String carrera;

    public Estudiante(String name, int edad, int cedula, String carrera) {
        this.name = name;
        this.edad = edad;
        this.cedula = cedula;
        this.carrera = carrera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
