/*
  Crear un programa que dado un numero determine si es par o impar.
 */
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa un numero: ");
        num = leer.nextInt();
        
        if(num%2 == 0){
            System.out.println("El numero es par");
            
        }else{
            System.out.println("El numero es impar");
        }
    }
}
