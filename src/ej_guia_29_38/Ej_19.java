/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ej_guia_29_38;


public class Ej_19 {
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, -0}},
                matrizTrans = new int[3][3];
       
        System.out.println("La matriz original es: ");
        muestraMatriz(matriz);
        rellenaMatrizTrans(matriz, matrizTrans);
        System.out.println("\nLa matriz transpuesta es: ");
        muestraMatriz(matrizTrans);
        if(antiSimetrica(matriz, matrizTrans)){
            System.out.println("\nLa matriz es anti simetrica");
        }else{
            System.out.println("\nLa matriz no es anti simetrica");
        }
    }
    
    public static void muestraMatriz(int[][] matriz){
        for(int[] fila: matriz){
            for(int elemento: fila){
                if(elemento >= 0){
                    System.out.print("[ " + elemento + "]");
                }else{
                    System.out.print("[" + elemento + "]");
                }  
            }
            System.out.println("");
        }
    } 
    public static void rellenaMatrizTrans(int[][] matriz, int[][] matrizTrans){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {  
                matrizTrans[i][j] = matriz[j][i];
                
            }
        }
    }
    public static boolean antiSimetrica(int[][] matriz, int[][] matrizTrans){
        boolean ban = true;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {  
                //Si en la original hay un cero pero la otra no, cambia bandera a falso
                if(matriz[i][j] == 0){
                    if(matrizTrans[i][j] != 0){
                        ban = false;
                        break;
                    }
                }
                //si en la original hay un numero negativo 
                if(matriz[i][j] < 0){
                    //y su valor absoluto no es igual al de la otra, cambia bandera a falso
                    if(Math.abs(matriz[i][j]) != matrizTrans[i][j]){
                        ban = false;
                        break;
                    }
                }
                //si la original es positiva
                if(matriz[i][j] > 0){
                    //si la otra es nagativa 
                   if(matrizTrans[i][j] < 0){
                       //validar si el valor de la original no es igual al valor absoluto de la otra, bandera a falso
                       if(matriz[i][j] != Math.abs(matrizTrans[i][j])){
                            ban = false;
                            break;
                       }
                   }else{//si la otra no es negativa, bandera a falso
                        ban = false;
                        break;
                   }
                }
                
            }
        }
       
        return ban; //bandera que indica si es anti simetrica o no 
    }
}
