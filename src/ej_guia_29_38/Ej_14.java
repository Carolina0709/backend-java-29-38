/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
    El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
 */
package ej_guia_29_38;

import java.util.Scanner;


public class Ej_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tipoMoneda = "";
        double euros = 0;
        
        System.out.println("Ingresa el tipo de cambio: ");
        System.out.println("LB  - para libras");
        System.out.println("USD - para dolar");
        System.out.println("YEN - para yenes");
        tipoMoneda = leer.nextLine();
        
        System.out.print("Ingresa la cantidad de euros: ");
        euros = leer.nextDouble();
        
        convertirEuros(tipoMoneda, euros);
    }
 public static void convertirEuros(String tipoMoneda, double euros){
     switch(tipoMoneda.toUpperCase()){
        case "LB": System.out.println(euros + " euros a libras son: " + (euros * 0.86));
                    break;
        case "USD": System.out.println(euros + " euros a dolares son: " + (euros * 1.28611));
                    break;
        case "YEN": System.out.println(euros + " euros a yenes son: " + (euros * 129.852));
                    break;
        default: System.out.println("El tipo de moneda es incorrecto.");
     }
 }
}
