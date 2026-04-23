package src.Refactor.EjerciciosSol;

public class Informe {
    
    private String nombre;
    private int edad;
    private double salario;
    private String direccion;
    private String telefono;

    public Informe(String nombre, int edad, double salario, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "El informe sobre " + nombre + ", con " + edad + " años, su salario es de " + salario + ", vive en " + direccion
                + " y su teléfono es " + telefono + " está listo";
    }

    public void imprimir() {
        System.out.println("--- FICHA DE EMPLEADO ---");
        System.out.println("Nombre: " + this.nombre); 
        System.out.println("Edad: " + this.edad);
        System.out.println("Salario: " + this.salario);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
    }

    public static void main(String[] args) {
    
        Informe fina = new Informe("Fina", 60, 2700, "Avenida del Paraíso 137", "+34 654 54 92 68");
        System.out.println(fina);
        fina.imprimir();

    }

}
