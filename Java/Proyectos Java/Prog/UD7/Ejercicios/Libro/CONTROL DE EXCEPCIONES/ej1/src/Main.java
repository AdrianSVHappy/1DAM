import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Ejercicio 1</h1><hr>
 * <p>Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-may-2024
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int cont = 0, introducir;

        do {

            try {
                System.out.println("Introduce un numero entero:");
                introducir = Integer.parseInt(sc.nextLine()) ;

                lista.add(introducir);

            } catch (NumberFormatException e) {

                System.out.println(e.getClass()); //Te dice el tipo de error
                System.out.println(e.getMessage()); //Te dice que ha producido el error

                System.out.println("No has introducido un numero entero, intentelo de nuevo.");
                //sc.nextLine();

            }


        }while (lista.size()<6);

        for (Integer i : lista) {
            System.out.println(i);
        }

    }
}