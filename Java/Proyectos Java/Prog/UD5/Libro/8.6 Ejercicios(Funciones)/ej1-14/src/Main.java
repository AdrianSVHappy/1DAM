import  matematicas.mates;

import java.util.Scanner;

/**
 * <p>1-14.
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.
 * </p>
 *
 * <p>1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.</p>
 * <p>2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.</p>
 * <p>3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.</p>
 * <p>4. potencia: Dada una base y un exponente devuelve la potencia.</p>
 * <p>5. digitos: Cuenta el número de dígitos de un número entero.
 * <p>6. voltea: Le da la vuelta a un número.</p>
 * <p>7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.</p>
 * <p>8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.</p>
 * <p>9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).</p>
 * <p>10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).</p>
 * <p>11. pegaPorDetras: Añade un dígito a un número por detrás.</p>
 * <p>12. pegaPorDelante: Añade un dígito a un número por delante.</p>
 * <p>13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.</p>
 * <p>14. juntaNumeros: Pega dos números para formar uno.</p>
 * */
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);

        System.out.println(mates.juntaNumeros(123,46));

    }
}