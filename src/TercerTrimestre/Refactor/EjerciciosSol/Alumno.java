public class Alumno {

    private String nombre;
    private String apellidos;
    private int edad = 0;   
    private String direccion;
    private String telefono;
    private String email;

    public Alumno(String nombre, String apellidos, int edad, String direccion, String telefono,
                  String email){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }

    @Override
    public String toString() {
        return "El alumno se llama " + nombre + apellidos + ", tiene " + edad + " años, y vive en " + direccion + ", su teléfono es " + telefono + " y su email " + email;
    }
}