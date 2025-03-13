import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <h1>Ejercicio 2</h1><hr>
 * <p>Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-may-2024
 */
public class Main {

    private static final String NOMF = "primos.dat";

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        String linea;

        try{
            br = new BufferedReader(new FileReader(NOMF));

            linea = br.readLine();

            while(linea != null) {

                System.out.println(linea);
                linea = br.readLine();
            }


        }catch(FileNotFoundException e){
            System.out.println(e.getClass() + "\n" + e.getMessage());
        }finally {
            if(br != null){
                br.close();
            }
        }

    }
}