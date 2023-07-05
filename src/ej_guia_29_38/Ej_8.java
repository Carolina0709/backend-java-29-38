/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_8 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        String frase;
        
        System.out.print("Ingresa una frase o palabra de longitud 8: ");
        frase = leer.nextLine();
        
        if(frase.length() == 8){
            System.out.println("Correcto! La frase tiene longitud 8");
        }else{
            System.out.println("Incorrecto! La frase no es de longitud 8");
        }
    }
    
    
}
