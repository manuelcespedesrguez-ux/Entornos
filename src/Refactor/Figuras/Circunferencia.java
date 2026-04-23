package src.Refactor.Figuras;

public class Circunferencia {
    private double radio;
    private String color;

    //Constructor de la clase
    public Circunferencia(double radio) {
        this.radio = radio;
        this.color=color;
    }

    //getters y setters
    public double getRad() {
        return radio;
    }

    public void setRad(double rad) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimir() {
        this.color = "rojo";   
        System.out.println("Diámetro: " + 2*radio);
        System.out.println("Color: " + color);
        System.out.println("El area es: "+ 2 * 3.1416 * radio * radio);
    }

    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}