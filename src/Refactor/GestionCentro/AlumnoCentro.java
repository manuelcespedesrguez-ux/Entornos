package src.Refactor.GestionCentro;

public class AlumnoCentro extends Persona{

    public AlumnoCentro(String nombre, int edad){
        super(nombre, edad);
    }

    public void matricularAlumno(Curso curso){
        System.out.println("El alumno "+getNombre()+" se ha matriculado en "+curso.getNombre());
    }

}