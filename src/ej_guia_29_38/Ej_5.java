/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
       
        System.out.print("Ingresa un numero entero: ");
        num = leer.nextInt();
        
        System.out.println("El doble de " + num + " es: " + (num * 2));
        System.out.println("El triple de " + num + " es: " + (num * 3));
        System.out.println("La raiz cuadrada de " + num + " es: " + (Math.sqrt(num)));
    }
}
