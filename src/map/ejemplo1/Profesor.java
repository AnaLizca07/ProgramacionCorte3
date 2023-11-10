package map.ejemplo1;

public class Profesor {
    private int id;
    private String nombre;
    private int salario;
    private String materia;

    public Profesor(int id, String nombre, int salario, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.materia = materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
