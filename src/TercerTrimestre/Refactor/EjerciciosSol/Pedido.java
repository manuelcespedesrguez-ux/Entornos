public class Pedido {

    private static final double DESCUENTO_VIP = 0.8;
    private static final double DESCUENTO_NORMAL = 0.95;

    public void procesarPedido(String cliente, String producto, int cantidad, double precioUnitario, String tipoCliente) {
        double total = calcularTotalConDescuento(cantidad, precioUnitario, tipoCliente);
        imprimirTicket(cliente, producto, cantidad, total);
    }

    private double calcularTotalConDescuento(int cantidad, double precioBase, String tipo) {
        double subtotal = cantidad * precioBase;
        
        return switch (tipo.toUpperCase()) {
            case "VIP" -> subtotal * DESCUENTO_VIP;
            case "NORMAL" -> subtotal * DESCUENTO_NORMAL;
            default -> subtotal;
        };
    }

    private void imprimirTicket(String cliente, String producto, int cantidad, double total) {
        System.out.println("--- DETALLE DEL PEDIDO ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: " + total);
    }
}