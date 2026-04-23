package EjercicioOrientObje;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        
        Scanner hidalgo = new Scanner(System.in);

        System.out.println("--- Introduzca los datos de la persona ---");

        System.out.print("Nombre: ");
        String nombre = hidalgo.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(hidalgo.nextLine());

        System.out.print("Sexo (H/M): ");
        char sexo = hidalgo.nextLine().toUpperCase().charAt(0);

        System.out.print("Peso (kg): ");
        double peso = Double.parseDouble(hidalgo.nextLine());

        System.out.print("Altura (m): ");
        double altura = Double.parseDouble(hidalgo.nextLine());

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        p3.setNombre("Fernando");
        p3.setEdad(35);
        p3.setPeso(89.6);
        p3.setAltura(1.78);

        Persona[] coleccion = {p1, p2, p3};
        
        for(Persona p : coleccion){
            //  IMC
            System.out.println(PersonaIMC(p));
            // Edad
            if(p.esMayorDeEdad())
                System.out.println(p.getNombre()+", mayor de edad");
            else
                System.out.println(p.getNombre()+", menor de edad.");
            //  Información
            System.out.println(p.toString());
            System.out.println("\n--------\n");
        }

        hidalgo.close();
    }

    //  Este método es para que el calculo del IMC no sea tan repetitivo
    public static String PersonaIMC(Persona p){
        int res = p.calcularIMC();
        if(res==-1) return p.getNombre()+" está por debajo del peso ideal";
        if(res==0) return p.getNombre()+" está en el peso ideal";
        if(res==1) return p.getNombre()+" está por encima del peso ideal";
        else return "El cálculo del IMC no es válido para "+p.getNombre();
    }
}