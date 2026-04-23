package src.TercerTrimestre.Refactor.GestionCentro;

public class Profesor extends Persona{

    public Profesor(String nombre, int edad){
        super(nombre, edad);
    }

    public void generarNomina(){
        System.out.println("Se ha generado una nómina para el profesor "+ getNombre());
    }
}