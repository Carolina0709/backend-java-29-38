/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_guia_29_38;

/**
 *
 * @author CastroD2
 */
public class EjercicioPractico19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long[][] matriz = new long[3][3];
        long sumaFila1= 0;
        long sumaFila2= 0;
        long sumaFila3= 0;
        
        long sumaColumna1= 0;
        long sumaColumna2= 0;
        long sumaColumna3= 0;
        
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        
        System.out.println("Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j] >=0){
                    System.out.print("[ "+matriz[i][j]+"]");
                } else{
                    System.out.print("["+matriz[i][j]+"]");
                }
                if(i == 0){
                    sumaFila1 = sumaFila1 + matriz[i][j];
                } else if(i == 1){
                    sumaFila2 = sumaFila2 + matriz[i][j];
                } else if(i == 2){
                    sumaFila3 = sumaFila3 + matriz[i][j];
                }
                
            }
            System.out.println("");
        }
        
        /*
        System.out.println("Suma Fila 1: "+ sumaFila1);
        System.out.println("Suma Fila 2: "+ sumaFila2);
        System.out.println("Suma FIla 3: "+ sumaFila3);
        */
        
        System.out.println("--------------------");
        
        System.out.println("Matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[j][i] >=0){
                    System.out.print("[ "+matriz[j][i]+"]");
                } else{
                    System.out.print("["+matriz[j][i]+"]");
                }
                
                if(i == 0){
                    sumaColumna1 = sumaColumna1 + matriz[i][j];
                } else if(i == 1){
                    sumaColumna2 = sumaColumna2 + matriz[i][j];
                } else if(i == 2){
                    sumaColumna3 = sumaColumna3 + matriz[i][j];
                }
                
            }
            
            
            System.out.println("");
        }
        /*
        System.out.println("Suma Columna 1: "+ sumaColumna1);
        System.out.println("Suma Columna 2: "+ sumaColumna2);
        System.out.println("Suma Columna 3: "+ sumaColumna3);
        */
        
        if(sumaFila1 == sumaColumna1 && sumaFila2 == sumaColumna2 && sumaFila3 == sumaColumna3 ){
            System.out.println("Matriz es anti simétrica");
        } else {
            System.out.println("Matriz no es anti simétrica");
        }
        
    }
    
}
