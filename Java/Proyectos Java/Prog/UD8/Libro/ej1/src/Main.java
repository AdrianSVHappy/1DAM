import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <h1>Ejercicio 1</h1><hr>
 * <p>Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-may-2024
 */
public class Main {

    private static final String NOMF = "primos.dat";

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = null;
        File myObj = new File(NOMF);

        if (myObj.createNewFile()) {
            System.out.println("Fichero creado: " + NOMF);
        }

        try {
            bw = new BufferedWriter(new FileWriter(NOMF));

            for (int i = 1; i < 501; i++) {
                if(esPrimo(i))
                    bw.write(i + "\n");
            }


        } catch (IOException e) {

            System.out.println(e.getClass() + "\n" + e.getMessage());

        } finally {

            if (bw != null) {
                bw.close();
            }
        }
    }

    public static boolean esPrimo (int n) {
        boolean es = true;

        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                es = false;
                break;
            }
        }

        return es;

    }
}