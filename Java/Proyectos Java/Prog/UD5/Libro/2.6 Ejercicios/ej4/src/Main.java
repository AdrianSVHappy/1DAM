/**
 * Ejercicio 4 -
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */

public class Main {
    public static void main(String[] args) {
//Variables
        double cambio = 166.386;
        short eur = 15;

        //Cuerpo

        System.out.println(eur +"€ son "+ (eur*cambio) +" Pesetas");
    }
}