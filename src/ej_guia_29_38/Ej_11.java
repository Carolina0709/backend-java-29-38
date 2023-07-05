/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
package ej_guia_29_38;

import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        int op;
        String op1;
        boolean banSalir = false;
        
        System.out.print("Ingresa el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2 = leer.nextInt();
        
        do{
            System.out.println("Elije una opcion: ");
            System.out.println("1. Sumar \n"
                    + "2. Restar \n"
                    + "3. Multiplicar \n"
                    + "4. Dividir \n"
                    + "5. Salir");
            op = leer.nextInt();
            
            switch(op){
            case 1: System.out.println("\nEl resultado es: " + (num1 + num2)+ "\n");
                    break;
            case 2: System.out.println("\nEl resultado es: " + (num1 - num2)+ "\n");
                    break;
            case 3: System.out.println("\nEl resultado es: " + (num1 * num2)+ "\n");
                    break;
            case 4: System.out.println("\nEl resultado es: " + (num1 / num2)+ "\n");
                    break;
            case 5: System.out.println("\n¿Está seguro que desea salir del programa (S/N)?");
                    leer.nextLine();
                    op1 = leer.nextLine();
                    
                    if(op1.toUpperCase().equals("S")){
                        System.out.println("Hasta luego!");
                        banSalir = true;
                    }
                    break;
            default: System.out.println("Opcion incorrecta, intenta nuevamente.");
                
            }
        }while(banSalir == false);
    }
}
