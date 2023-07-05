/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package ej_guia_29_38;


public class Ej_18 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        
        rellenaMatriz(matriz);
        System.out.println("La matriz original es: ");
        muestraMatriz(matriz);
        System.out.println("\nLa matriz transpuesta es: ");
        muestraMatrizTranspuesta(matriz);
    }
    public static void rellenaMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*10+1);
             }
        }
    }
    public static void muestraMatriz(int[][] matriz){
        for(int[] fila: matriz){
            for(int elemento: fila){
                if(elemento == 10){
                    System.out.print("[" + elemento + "]");
                }else{
                    System.out.print("[0" + elemento + "]");
                }
                
            }
            System.out.println("");
        }
    } 
    public static void muestraMatrizTranspuesta(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[j][i] == 10){
                    System.out.print("[" + matriz[j][i] + "]");
                }else{
                    System.out.print("[0" + matriz[j][i] + "]");
                }
            }
            System.out.println("");
        }
    }
}
