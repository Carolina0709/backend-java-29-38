/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        
        System.out.print("Ingresa la dimension de tu vector: ");
        dimension = leer.nextInt();
        
        int[] vector = new int[dimension];
        
        rellenaVector(vector);
        
        cuentaDigitos(vector);
    }
    public static void rellenaVector(int[] vector){
        int num = 0;
        
        Scanner leer =  new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            while(num < 1 || num > 99999){
                System.out.print("Ingresa valor para posicion [" + i + "]: ");
                num = leer.nextInt();
                vector[i] = num;
                
            }
            num = 0;
            
        }
    }
    public static void muestraVector(int[] vector){
        System.out.println("\nEl arreglo es el siguiente: ");
        for(double elemento: vector){
            System.out.print("[" + elemento + "]");
        }
    }
    public static void cuentaDigitos(int[] vector){
        int conta_1=0, conta_2=0, conta_3=0, conta_4=0, conta_5=0, digitos = 0;
       
        for(int elemento: vector){
            while(elemento > 9 ){
                elemento = elemento / 10;
                digitos += 1;    
            }
            digitos +=1;
            switch(digitos){
                case 1: conta_1 += 1;
                     break;
                case 2: conta_2 += 1;
                     break;
                case 3: conta_3 += 1;
                     break;
                case 4: conta_4 += 1;
                     break;
                case 5: conta_5 += 1;
                     break;
            }
            digitos = 0;
        }
        muestraVector(vector);
        System.out.println("El vector tiene lo sigueinte: ");
        System.out.println("Valores de 1 digito: " + conta_1);
        System.out.println("Valores de 2 digito: " + conta_2);
        System.out.println("Valores de 3 digito: " + conta_3);
        System.out.println("Valores de 4 digito: " + conta_4);
        System.out.println("Valores de 5 digito: " + conta_5);
    }
}
