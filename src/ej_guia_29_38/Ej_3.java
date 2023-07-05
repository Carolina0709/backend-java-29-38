/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.print("Ingresa una frase: ");
        frase = leer.nextLine();
        
        System.out.println("\nLa frase en mayusculas es: ");
        System.out.println(frase.toUpperCase() + "\n");
        
        System.out.println("La frase en minusculas es: " );
        System.out.println(frase.toLowerCase());
        
        
    }
}
