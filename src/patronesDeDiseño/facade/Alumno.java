package patronesDeDiseño.facade;

public class Alumno {
    public String nombre;
    public void validacionAlum(){
        System.out.println("Se está validando al alumno: "+nombre);
    }

    public void validacionEdad(){
        System.out.println("Se está validando la edad del alumno "+nombre);
    }
}
