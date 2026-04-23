public class Factura {
    //1. Identifica el bad smell.
    //2. Refactoriza separando logica de calculo y presentacion.
    //3. Crea metodos auxiliares.

    //atributos de la clase
    private String cliente;
    private String producto;
    private int cantidad;
    private double precio;
    private double subtotal;
    private double iva;
    private double total;

    //constructor de la clase
    public Factura(String cliente, String producto, int cantidad, double precio){
        this.cliente=cliente;
        this.producto=producto;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    //metodos
    public double subtotal(){
        //metodo que devuelve el subtotal de un producto
        return this.subtotal=cantidad*precio;
    }

    public double parteIVA(){
        //metodo que te indica cuanto es la parte de IVA a sumar a la factura
        return this.iva=subtotal*0.21;
    }

    public double total(){
        //metodo que devuelve el valor final de la compra
        return this.total=subtotal+iva;
    }

    //generamos la factura de la compra
    public void generarFactura(){
        System.out.println("******** FACTURA ********");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
        System.out.println("***********************");
    }

}