/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 pantalla.
 */
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
}
