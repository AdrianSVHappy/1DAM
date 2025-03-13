import java.util.HashMap;
import java.util.Scanner;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta un diccionario español -> ingles</p>
 *
 * <p>Ejercicio 10 <br>
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-may-2024
 */
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String key;
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("perro", "dog");
        dic.put("gato", "cat");
        dic.put("caballo", "horse");
        dic.put("cerdo", "pig");
        dic.put("coche", "car");
        dic.put("pajaro", "bird");
        dic.put("serpiente", "snake");
        dic.put("water", "agua");
        dic.put("fuego", "fire");
        dic.put("tortuga", "turtle");
        dic.put("hámster", "hamster");
        dic.put("cobaya", "guinea pig");
        dic.put("conejo", "rabbit");
        dic.put("elefante", "elephant");
        dic.put("pez", "fish");


        key = sn.nextLine();
        if(dic.get(key) != null)
            System.out.println( key + " --> " +dic.get(key));
        else
            System.out.println("Registro no encontrado");


    }
}