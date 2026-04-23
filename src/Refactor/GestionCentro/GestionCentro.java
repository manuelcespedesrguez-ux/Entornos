package src.Refactor.GestionCentro;

public class GestionCentro {

    public static void main(String[] args) {
        Curso curso1= new Curso("1ºDAM");
        Profesor profe1= new Profesor("Carlos Antonio", 45);
        AlumnoCentro alumno1= new AlumnoCentro("Miguel Castro", 17);
        Incidencias incidencia1= new Incidencias("grave");

        //METODOS
        curso1.generarHorario();
        System.out.println("------------------------------------------------");
        profe1.generarNomina();
        System.out.println("------------------------------------------------");
        alumno1.matricularAlumno(curso1);
        System.out.println("------------------------------------------------");
        incidencia1.generarIncidencia(curso1, alumno1);
        System.out.println("------------------------------------------------");
    }
}