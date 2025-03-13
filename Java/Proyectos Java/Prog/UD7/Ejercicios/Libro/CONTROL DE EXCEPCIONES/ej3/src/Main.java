import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <h1>Ejercicio 3</h1><hr>
 * <p>Realiza un programa que genere una excepción de forma aleatoria de entre
 * las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
 * IndexOutOfBoundsException y ArithmeticException.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-may-2024
 */
public class Main {
    public static void main(String[] args){

        try {
            switch ((int) (Math.random() * 5)) {
                case 0:
                    System.out.println(0);
                    throw (new NumberFormatException());
                case 1:
                    System.out.println(1);
                    throw (new IOException());
                case 2:
                    System.out.println(2);
                    throw (new FileNotFoundException());
                case 3:
                    System.out.println(3);
                    throw (new IndexOutOfBoundsException());
                case 4:
                    System.out.println(4);
                    throw (new ArithmeticException());
            }
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }

    }
}