package patronesDeDiseño.facade;

public class Universidad {
    private Alumno alumno;
    private Profesor profesor;

    public Universidad(){
        this.alumno = new Alumno();
        this.profesor = new Profesor();
    }

    public void validaciones(){
        alumno.nombre = "Juan Sebastian";
        profesor.nombre = "Arle";
        alumno.validacionAlum();
        alumno.validacionEdad();
        profesor.validacionProf();
    }

}
