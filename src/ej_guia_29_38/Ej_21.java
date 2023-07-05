/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ej_guia_29_38;


public class Ej_21 {
    public static void main(String[] args) {
        int[][] matriz10 = {{1,26,36,47,5,6,72,81,36,10},{11,12,13,21,41,22,67,20,10,61},
            {56,78,87,90,9,90,17,12,87,67},{41,87,24,56,97,74,87,42,64,35},
            {32,76,79,1,36,5,67,96,12,11},{99,13,54,88,89,90,75,12,41,76},
            {67,78,87,45,14,22,26,42,56,78},{98,45,34,23,32,56,74,16,19,18},
            {24,67,97,46,87,13,67,89,63,24},{21,68,78,98,90,67,12,41,65,12}};
        int[][] matriz3 = {{36,5,67},{89,90,75},{14,22,26}};
        
        System.out.println("La matriz 10x10 es: ");
        muestraMatriz(matriz10);
        
        System.out.println("\nLa matriz 3x3 es: ");
        muestraMatriz(matriz3);
        
        encuentraMatriz(matriz10, matriz3);
    }
    
    public static void muestraMatriz(int[][] matriz){
        for(int[] fila: matriz){
            for(int elemento: fila){
                if(elemento < 10){
                    System.out.print("[0" + elemento + "]"); 
                }else{
                    System.out.print("[" + elemento + "]"); 
                }
                
            }
            System.out.println("");
        }
    } 
    public static void encuentraMatriz(int[][] matriz10, int[][] matriz3){
        int conta = 0; //conta para conocer si las 9 posiciones de las matrices son iguales
        boolean ban = false; //bandera para conocer si la matriz no existiera dentro de la otra
        
        for (int i = 0; i < matriz10.length-2; i++) {
            for (int j = 0; j < matriz10.length-2; j++) { //recorrer la matriz grande
                //si encontraramos alguna coincidencia con nuestra primera posicion de matriz 3
                //es decir, una posible matriz3 dentro de la 10
                if(matriz3[0][0] == matriz10[i][j]){ 
                    //fors que recorreran la matriz3 y la 10 pero simulando una matriz 3x3 dentro
                    for (int k = 0; k < matriz3.length; k++) {
                        for (int l = 0; l < matriz3.length; l++) {
                            //k y l van del 0 al 2.
                            //Y para la matriz 3x3 previamente definida. 
                            //Asi la recorro posicion por posicion pero solo simulando una matriz de 3x3
                            //k+i == 0+4, 1+4, 2+4
                            //l+j == 0+4, 1+4, 2+4
                            if(matriz3[k][l] == matriz10[k+i][l+j]){
                                conta += 1; 
                            }
                        }
                    }
                    if(conta == 9){ //si conta = 9 es decir, la matriz 3x3 se encuentra en la 10x10
                        System.out.println("\nLa matriz de 3x3 se encuentra en: ");
                        imprimePosicion(i,j); //metodo que imprimen sus posiciones en base a la primera incidencia i y j
                        ban = true; //matriz encontrada, ban cambia a verdadero
                    }
                    conta=0; //se reinicia contador ya que el programa encuentra todas las posiciones matriz, no solo 1
                    
                }
            }
        }
        if(ban == false){
            System.out.println("\nLa matriz de 3x3 no se encuentra en la matriz 10x10");
        }
    }
    public static void imprimePosicion(int i, int j){
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print("["+ (i+k)+"," + (j+l)+ "]");
            }
            System.out.println("");
        }
    }
}
