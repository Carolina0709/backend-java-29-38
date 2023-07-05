/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension, num;
        
        System.out.print("Ingresa la dimension de tu vector: ");
        dimension = leer.nextInt();
        
        int[] vector = new int[dimension];
        
        System.out.print("Ingresa un numero a buscar: ");
        num = leer.nextInt();
        
        rellenaVector(vector);
        
        buscaNum(vector, num);
        
        muestraVector(vector);
    }
    
    public static void rellenaVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            //con (int) los dobles se vuelven enteros. 
            //por 10 hace que se generen nmeros del 0 al 9
            //sumo 1 para obtenerlos del 1 al 10
            vector[i] = (int) (Math.random() * 10 +1);
        }
    }
    public static void buscaNum(int[] vector, int num){
        int contaRepetido = 0;
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == num){
                System.out.println("Se encontro coincidencia del num [" + vector[i] + "] en la posicion " + (i+1));
                contaRepetido = contaRepetido + 1;
            }
        }
        
        if(contaRepetido == 0){
            System.out.println("El numero no se encuentra dentro del arreglo");
        }
    }
    public static void muestraVector(int[] vector){
        System.out.println("\nEl arreglo es el siguiente: ");
        for(double elemento: vector){
            System.out.print("[" + elemento + "]");
        }
    }
}
