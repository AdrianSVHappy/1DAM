import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * <p>Ejercicio 16<br>
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
 * principio, el programa solo conoce las capitales de España, Portugal y Francia.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
 * diccionario. El usuario sale del programa escribiendo la palabra “salir”. <br>
 * Ejemplo:
 * </p>
 *
 * <pre>
 * Escribe el nombre de un país y te diré su capital: España
 * La capital de España es Madrid
 * Escribe el nombre de un país y te diré su capital: Alemania
 * No conozco la respuesta ¿cuál es la capital de Alemania?: Berlín
 * Gracias por enseñarme nuevas capitales
 * Escribe el nombre de un país y te diré su capital: Portugal
 * La capital de Portugal es Lisboa
 * Escribe el nombre de un país y te diré su capital: Alemania
 * La capital de Alemania es Berlín
 * Escribe el nombre de un país y te diré su capital: Francia
 * La capital de Francia es París
 * Escribe el nombre de un país y te diré su capital: salir
 *
 * </pre>
 *
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 14-may-2024
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, String> lista;

        lista = infoBasica();

        preguntar(lista);

    }

    public static HashMap<String, String> infoBasica() {
        HashMap<String, String> lista = new HashMap<String, String>();

        lista.put("España", "Madrid");
        lista.put("Portugal", "Lisboa");
        lista.put("Francia", "Paris");


        return lista;
    }

    public static void preguntar(HashMap<String, String> lista) {

        String pais, capital;
        boolean seguir = true;


        while (seguir) {

            System.out.println("Escribe el nombre de un país y te diré su capital: ");

            pais = sc.nextLine();

            if (pais.equals("salir")) {
                seguir = false;

            } else if (lista.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + lista.get(pais));
            } else {

                System.out.println(" No conozco la respuesta ¿cuál es la capital de " + pais + "?:");
                capital = sc.nextLine();
                lista.put(pais, capital);

                System.out.println("Gracias por enseñarme nuevas capitales");
            }

        }
    }


}