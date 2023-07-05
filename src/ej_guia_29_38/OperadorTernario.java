package ej_guia_29_38;

public class OperadorTernario {
    public static void main(String[] args){
       // variable = condicion ? verdadero : falso -- abreviación de un  if/else
        String variable = 7 ==7 ? "si, es verdadero" : "es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double prom = 6.2;

        estado = prom >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

    }
}
