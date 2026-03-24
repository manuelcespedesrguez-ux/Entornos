package Ejercicio;

public class Usuario {
    //atributos
    private String dni;
    private String nombre;
    //métodos
    public Usuario(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getDNI(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public String toString(){
        return "Don/Doña "+nombre+" con DNI: "+dni;
    }
}