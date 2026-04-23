package src.TercerTrimestre.Refactor.GestionCentro;

public class Curso {
    private String nombre;

    public Curso(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void generarHorario(){
        System.out.println("Se ha creado un horario para el curso "+getNombre());
    }
}