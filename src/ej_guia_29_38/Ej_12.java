/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "";
        int correctas=0, incorrectas=0;
        
        
        
        while(!(frase.equals("&&&&&"))){
            System.out.print("Ingresa una cadena: ");
            frase = leer.nextLine();
            frase = frase.toUpperCase();
        
            if(frase.length() <= 5 && frase.startsWith("X") && frase.endsWith("O")){
                correctas = correctas + 1;
            }else{
                incorrectas = incorrectas +1;
            }
        }
        
        System.out.println("INFORME DE LECTURAS");
        System.out.println("Se enviaron " + correctas + "cadenas correctas");
        System.out.println("Se enviaron " + (incorrectas-1) + "cadenas incorrectas");
    }
    
}
