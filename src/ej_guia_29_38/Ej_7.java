/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.print("Ingresa una frase: ");
        frase = leer.nextLine();
        
        if(frase.toLowerCase().equals("eureka")){
            System.out.println("Correcto! Haz acertado la frase.");
        }else{
            System.out.println("Incorrecto!. No haz acertado la frase. ");
        }
    }
}
