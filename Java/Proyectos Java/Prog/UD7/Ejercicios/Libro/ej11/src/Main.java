import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * <p>Ejercicio 11 <br>
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
 * del ejercicio anterior. El programa irá pidiendo que el usuario teclee
 * la traducción al inglés de cada una de las palabras y comprobará si son
 * correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
 * y cuántas erróneas.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-may-2024
 */
public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        String value = "", key = "", respuesta;
        int num = 1, correctas = 0;
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


        System.out.println("Escribe todas las letras en minuscula");

        for (int i = 0; i < 5; i++) {
            num = (int) (Math.random() * dic.size());


//            System.out.println(num);

            System.out.println(dic.keySet().toArray()[num]);

            key = dic.keySet().toArray()[num].toString();
            value = dic.get(key);

           /* for (Map.Entry palabra : dic.entrySet()) {

                //Encontrar la palabra
                if (num == 0) {

                    key = palabra.getKey().toString();
                    value = palabra.getValue().toString();

                    break;
                }
                num --;
            }*/

            //Hacer la pregunta
            System.out.println("¿Cual es la traducción de " + key + " ?");

            respuesta = sn.nextLine();

            //Evaluar la pregunta
            if (respuesta.equals(value)) {
                correctas++;
                System.out.println("Correcto (" + correctas + ")");
            }else
                System.out.println("Incorrecto");

            //Mostrar respuesta correcta
            System.out.println("Key: " + key + " - Value: " + value);

        }

        //Mostrar puntuación final
        System.out.println("\nTu puntuación: " + correctas);

        System.out.println("\n");

        //Mostrar diccionario
        for (Map.Entry aux : dic.entrySet()) {

            System.out.println(num + " - Key: " + aux.getKey() + " - Value: " + aux.getValue());

            num ++;
        }

    }
}