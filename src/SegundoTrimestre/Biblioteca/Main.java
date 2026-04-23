package Biblioteca;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca Bib = new Biblioteca(10, 10);
        boolean bucle = true;

        while(bucle==true){

        System.out.println("(1) Añadir libro\n(2)Añadir usuario\n(3) Prestar libro\n(4)Devolver libro\n(5) Listar libros\n(6) Listar libros disponibles\n(7) Listar usuarios\n(8) Salir");

        int opcion = Integer.parseInt(sc.nextLine());
        String isbn, tit, aut, dni, nom;

        switch (opcion) {
            case 1:
                System.out.println("Añade el ISBN del libro:");
                isbn = sc.nextLine();
                System.out.println("Añade su título:");
                tit = sc.nextLine();
                System.out.println("Provee su autor:");
                aut = sc.nextLine();

                Libro lib = new Libro(isbn, tit, aut);
                Bib.agregarLibro(lib);
                break;

            case 2:
                System.out.println("Añade el DNI del usuario:");
                dni = sc.nextLine();
                System.out.println("Ingrese su nombre:");
                nom = sc.nextLine();

                Usuario us = new Usuario(dni, nom);
                Bib.agregarUsuario(us);
                break;

            case 3: 
                System.out.println("Ingrese el ISBN del libro:");
                isbn = sc.nextLine();
                System.out.println("Ingrese su DNI:");
                dni = sc.nextLine();

                Bib.prestarLibro(isbn, dni);
                break;

            case 4:
                System.out.println("Ingrese el ISBN del libro que desee devolver:");
                isbn = sc.nextLine();

                Bib.devolverLibro(isbn);
                break;

            case 5:
                Bib.listarLibros();
                break;

            case 6:
                Bib.listarLibrosDisponibles();
                break;
            
            case 7:
                Bib.listarUsuarios();
                break;

            case 8:
                bucle = false;
                break;
        
            default:
                System.out.println("Elige una opción, por favor");
                break;
            }
        }

        System.out.println("Adiós");

        sc.close();        
    }
}
