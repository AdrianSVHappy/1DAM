import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("dd", "ed", 4));
        personas.add(new Persona("bb", "zb", 2));
        personas.add(new Persona("cc", "ac", 3));
        personas.add(new Persona("aa", "aa", 1));


        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println("----------------");
        Collections.sort(personas);

        for (Persona persona : personas) {
            System.out.println(persona);
        }


    }
}