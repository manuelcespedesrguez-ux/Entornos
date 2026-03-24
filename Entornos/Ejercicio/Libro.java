package Ejercicio;

public class Libro {
    //atributos
    private String isbn = null;
    private String titulo = null;
    private String autor = null;
    private boolean disponible = true;
    //constructor
    public Libro(String isbn, String tit, String aut){
        this.isbn = isbn;
        this.titulo = tit;
        this.autor = aut;
    }
    //getters
    public String getISBN(){
        return this.isbn;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean isDisponible(){
        return this.disponible;
    }
    //otros métodos (setters para disponibilidad)
    public boolean prestar(){
        if(this.disponible==true) {
            this.disponible = false;
            return true;
        }
        else return false;
    }
    public void devolver(){
        this.disponible=true;
    }
    @Override
    public String toString(){
        return titulo+", "+autor+".\nISBN: "+isbn+"\nDisponibilidad: "+disponible;
    }
}