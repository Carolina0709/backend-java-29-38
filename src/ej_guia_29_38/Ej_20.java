/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_20 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        rellenaMatriz(matriz);
        muestraMatriz(matriz);
        
        if(validaSuma(matriz)){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
    }
    public static void rellenaMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        int num = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                 while(num < 1 || num > 10){ //Valida que solo se ingresen numeros del 1 al 9
                    System.out.print("Ingresa valor para posicion [" + i + "][" + j + "]: ");
                    num = leer.nextInt();
                    //evitar que se ingresen numeros repetidos
                    if(encuentraRepetido(matriz, num)){
                        matriz[i][j] = num;
                    }else{
                        num = 0;
                    }
                }
                 num = 0;
            }
        }
    }
    public static void muestraMatriz(int[][] matriz){
        for(int[] fila: matriz){
            for(int elemento: fila){
                System.out.print("[" + elemento + "]"); 
            }
            System.out.println("");
        }
    } 
    //validar que los numeros del 1 al 9 solo se ingresen una sola vez
    public static boolean encuentraRepetido(int[][] matriz, int num){
        boolean ban = true;
        //for que recorre toda la matriz
        for(int[] fila: matriz){
            for(int elemento: fila){
                //Si el numero ya existe devuelve falso y se cortan los for
                if(num == elemento){
                    ban= false;
                    break;
                }
            }
        }
        return ban;
    }
    public static boolean validaSuma(int[][] matriz){
        boolean ban = true;
        int sumaFilas = 0, sumaColumnas = 0, sumaDiagonal = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) { 
                sumaFilas += matriz[i][j]; //sumar todos los valores de una fila
                sumaColumnas += matriz[j][i]; //sumar todos los valores de 1 columna
                if(i==j){ //sumar solamente los valores de la diagonal
                    sumaDiagonal += matriz[i][j];
                }
            } //Al terminar el primer for, es decir, cuando se termina de leer una fila o una columna
            //validar, si alguna de las sumas no es 15
            if(sumaFilas != 15 || sumaColumnas != 15){
                ban = false; //cambiar bandera para inficar que no es magica
            }
            sumaFilas = 0; //reiniciar la suma de filas para hacerlo de 1 por 1
            sumaColumnas = 0; //reiniciar la fila de las columnas para hacerla de 1 por 1
        }
        //validar suma de la diagonal, despues del segundo for porque es necesario recorrer toda 
        //la matriz en este caso
        if(sumaDiagonal != 15){ 
            ban = false;
        }
        return ban;
    }
}
