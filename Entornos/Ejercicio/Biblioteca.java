package Ejercicio;

public class Biblioteca {

    int numLibros = 0;
    int numUsuarios = 0;
    Libro[] libros = new Libro[numLibros];
    Usuario[] usuarios = new Usuario[numUsuarios];

    public Biblioteca(int maxLibros, int maxUs){
        this.numLibros = maxLibros;
        this.numUsuarios = maxUs;
    }
    public boolean agregarLibro(Libro l){
        boolean t = false;
        if(numLibros<libros.length){
            for(int i=0; i<libros.length; i++){
                if(libros[i].getISBN().equalsIgnoreCase(l.getISBN())){
                    System.out.println("Ya existe un libro con ese ISBN!");
                    t = false;
                }
                else{
                    libros[i] = l;
                    System.out.println("Libro guardado correctamente!");
                    numLibros++;
                    t = true;
                }
            }
        } 
        else{
            t = false;
            System.out.println("Almacenamiento completo. No se pueden agregar más.");
        }

        return t;
    }
    public boolean agregarUsuario(Usuario u){
        boolean t = false;
        if(numUsuarios<usuarios.length){
            for(int i=0; i<usuarios.length; i++){
                if(usuarios[i].getDNI().equalsIgnoreCase(u.getDNI())){
                    System.out.println("Ya existe un usuario con ese DNI!");
                    t = false;
                }
                else{
                    usuarios[i] = u;
                    System.out.println("Usuario guardado correctamente!");
                    numUsuarios++;
                    t = true;
                }
            }
        }
        else{
            t = false;
            System.out.println("Almacenamiento completo. No se pueden agregar más.");
        }
        return t;
    }
    public Libro buscarLibroPorIsbn(String isbn){
        for(int i=0; i<libros.length; i++){
            if(libros[i].getISBN().equalsIgnoreCase(isbn)) return libros[i];
        }
        return null;
    }
    public Usuario buscarUsuarioPorDni(String dni){
        for(int i=0; i<usuarios.length; i++){
            if(usuarios[i].getDNI().equalsIgnoreCase(dni)) return usuarios[i];
        }
        return null;
    }
    public boolean prestarLibro(String isbn, String dni){
        boolean bool=false;
        if(buscarLibroPorIsbn(isbn)==null && buscarUsuarioPorDni(dni)==null) bool = false;
        else {
            if(buscarLibroPorIsbn(isbn).isDisponible()==true){
                buscarLibroPorIsbn(isbn).prestar();
                bool = true;
            }
            else bool = false;
        }
        return bool;
    }
    public boolean devolverLibro(String isbn){
        boolean bool=false;
        if(buscarLibroPorIsbn(isbn)!=null){
            buscarLibroPorIsbn(isbn).devolver();
            bool = true;
        }
        else bool = false;
        return bool;
    }
    public void listarLibros(){
        for(int i=0; i<numLibros; i++){
            System.out.println(libros[i]);
        }
    }
    public void listarLibrosDisponibles(){
        for(int i=0; i<numLibros; i++){
            if(libros[i].isDisponible()==true) System.out.println(libros[i]);
        }
    }
    public void listarUsuarios(){
        for(int i=0; i<numUsuarios; i++){
            System.out.println(usuarios[i]);
        }
    }
}