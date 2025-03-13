import java.util.Scanner;

/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Main {

    static final int N = 50;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        Factura test = new Factura(0, new Cliente(0, "a", "a", "a", "a", "a", "a", "a"));

        System.out.println(test);


    }

}