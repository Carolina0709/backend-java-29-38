/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float centigrados;
       
        System.out.print("Ingresa los grados centigrados: ");
        centigrados = leer.nextFloat();
        
        System.out.println("Convertidos a Fahrenheit: " + (32 + (9 * centigrados / 5)));
    }
}
