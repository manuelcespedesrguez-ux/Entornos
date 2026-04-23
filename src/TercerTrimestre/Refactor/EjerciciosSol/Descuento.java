import java.util.HashMap;
import java.util.Map;

public class Descuento {
    
    private static final Map<String, Double> Descuentos = new HashMap<>();

    public static void Descuentos() {
        Descuentos.put("Normal", 1.0);
        Descuentos.put("VIP", 0.9);
        Descuentos.put("Premium", 0.8);
    }

    public double calcular(String tipoCliente, double precio) {
        
        return precio * Descuentos.get(tipoCliente);

    }

}
