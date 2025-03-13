import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * <p>Ejercicio 2
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 07-may-2024
 */
public class Main {
    public static void main(String[] args) {


        int suma = 0;
        int total = (int)(Math.random()*11)+10;
        ArrayList<Integer> aleatorios = new ArrayList <Integer>();


        for (int i = 0; i < total; i++) {

            aleatorios.add((int)(Math.random()*101));

        }

        for (Integer aleatorio : aleatorios) {
            System.out.println(aleatorio);
            suma += aleatorio;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (suma / total));
        System.out.println("Maximo: " + (Collections.max(aleatorios)));
        System.out.println("Minimo: " + (Collections.min(aleatorios)));

    }
}