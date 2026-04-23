package src.Refactor.EjerciciosSol;

public class NotaFinal {
    
    private static final double nota_aprobado = 5.0;

    public boolean aprobar(double nota){
        if (nota >= nota_aprobado) {
            return true;
        } else 
            return false;
    }

    public static boolean aprobadoSi(double nota) {
        return nota >= nota_aprobado;
    }

    public static void main(String[] args) {
        
        System.out.println(NotaFinal.aprobadoSi(6));
        System.out.println(NotaFinal.aprobadoSi(4));

    }

}
