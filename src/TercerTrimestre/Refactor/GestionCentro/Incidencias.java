package src.TercerTrimestre.Refactor.GestionCentro;

public class Incidencias {
    private String tipo;

    public Incidencias(String tipo){
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void generarIncidencia(Curso curso, AlumnoCentro alumno){
        System.out.println("Se ha generado una incidencia del tipo "+getTipo()+" para el "+alumno.getNombre()+", el cúal cursa " +
                curso.getNombre());
    }
}