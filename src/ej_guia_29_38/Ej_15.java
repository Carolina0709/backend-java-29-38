/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ej_guia_29_38;


public class Ej_15 {
    public static void main(String[] args) {
       int[] vector = new int[100];
       
        rellenaVector(vector);
        muestraVector(vector);
     
        
    }
    public static void rellenaVector(int[] vector){

        for (int i = 0; i < vector.length; i++) {
               vector[i] = i + 1;
           }
    }
    public static void muestraVector(int[] vector){
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
