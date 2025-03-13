import java.util.ArrayList;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * <p>Ejercicio 1
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * to.do el ArrayList sin usar ningún índice.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 07-may-2024
 */
public class Main {
    public static void main(String[] args) {

        ArrayList <String> nombres = new ArrayList <String> ();

        nombres.add("Jose");
        nombres.add("Julie");
        nombres.add("Julio");
        nombres.add("Antonio");
        nombres.add("Manuel");
        nombres.add("Maria");


        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}