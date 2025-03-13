/**
 * Ejercicio 1  -
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        short x = 144,
            y = 999;

        //Cuerpo

        System.out.print("Suma: "+ (x+y) +
                "\nResta: "+ (x-y) +
                "\nDivisión: "+ ((float)x/(float)y) +
                "\nMultiplicación: "+ (x*y));
    }
}