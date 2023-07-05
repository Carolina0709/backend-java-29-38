/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 dos. El programa deberá después mostrar el resultado de la suma
 */
package ej_guia_29_38;

import java.util.Scanner;
/**
 *
 * @author caro9
 */
public class Ej_1 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        num1 = leer.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        num2 = leer.nextInt();
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1+num2));
    }
}
