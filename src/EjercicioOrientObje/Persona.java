package EjercicioOrientObje;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo='H';
        this.peso=0;
        this.altura=0;
        this.DNI=generaDNI();
    }

    public Persona(String nom, int ed, char sex){
        this();
        this.nombre=nom;
        this.edad=ed;
        this.sexo=sex;
    }

    public Persona(String nom, int ed, char sex, double p, double a){
        this();
        this.nombre=nom;
        this.edad=ed;
        this.sexo=sex;
        this.peso=p;
        this.altura=a;
    }

    public int calcularIMC(){
        if(this.altura==0) return 666;
        double IMC= this.peso/Math.pow(this.altura,2);
        int res;
        if(IMC<20) res= -1;
        else if(IMC>=20 && IMC<=25) res= 0;
        else res= 1;

        return res;
    }

    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }

    private char comprobarSexo(char sexo){
        if(sexo != 'H' && sexo != 'F') return 'H';
        return sexo;
    }

    @Override
    public String toString(){
        return this.nombre+ ", "+this.edad+" años, sexo: "+this.sexo+" y DNI "+this.DNI+".\nCon peso: "+this.peso+"kg y altura: "+altura+"m.";
    }

    public String generaDNI(){
        Random rn = new Random();
        int num= rn.nextInt(90000000)+10000000;
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char L = letras.charAt(num%23);

        return String.valueOf(num)+L;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) { 
        this.sexo = comprobarSexo(sexo); 
    }

    public void setPeso(double peso) { 
        this.peso = peso; 
    }

    public void setAltura(double altura) { 
        this.altura = altura; 
    }

    public String getNombre(){
        return this.nombre;
    }
}