import java.util.Scanner;

public class Tienda {
    //1. Detecta el codigo duplicado.
    //2. Crea un metodo reutilizable.
    //3. Simplifica la clase.
    public static Scanner sc=new Scanner(System.in);
    public double calcularPrecioFinalProducto(double precio) {
        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;
        return precioFinal;
    }
    public void utilizarMetodo(){
        boolean seguir=true;
        while (seguir){
            System.out.println("Dime el precio del producto");
            double precio=Integer.parseInt(sc.nextLine());
            calcularPrecioFinalProducto(precio);
            System.out.println("Tienes otro producto para añadir?: 1(si) 2(no)");
            int respuesta=Integer.parseInt(sc.nextLine());
            if (respuesta==2){
                seguir=false;
            }
        }
    }
}

