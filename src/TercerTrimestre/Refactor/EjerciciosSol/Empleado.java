public class Empleado {
    
    public double calcularSalario(double horas, double precioHora) {
        return horas * precioHora;
    }

    public void mostrarSalario(double salario) {
        System.out.println("El salario del empleado es: " + salario);
    }

}
