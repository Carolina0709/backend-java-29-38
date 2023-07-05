/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, num1 = 0, suma = 0;
        
        while(num < 1 ){ //Valida que el limite sea positivo
            System.out.print("Ingresa un numero: ");
            num = leer.nextInt();
        }
        while(suma <= num){ //realiza la suma hasta que supere el limite
            System.out.print("Ingresa un numero: ");
            num1 = leer.nextInt();
            
            suma = suma + num1;
        }
        System.out.println("La suma final es: " + suma);
        
        
    }
    
}
