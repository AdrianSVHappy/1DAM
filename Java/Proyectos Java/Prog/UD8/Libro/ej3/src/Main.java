import java.io.*;

/**
 * <h1>Ejercicio 3</h1><hr>
 * <p>Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 * primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
 * pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes. </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-may-2024
 */
public class Main {

    private static String RF1 = "leo1.txt";
    private static String RF2 = "leo2.txt";
    private static String WF = "escribo.txt";

    public static void main(String[] args) throws IOException {

    File myFile = new File(WF);
    BufferedReader br1 = null, br2 = null;
    BufferedWriter bw = null;
    String linea1, linea2;

    try {
        if (myFile.createNewFile()) {
            System.out.println("Se ha creado el fichero: " + WF);
        }

        br1 = new BufferedReader(new FileReader(RF1));
        br2 = new BufferedReader(new FileReader(RF2));
        bw = new BufferedWriter(new FileWriter(WF));

        linea1 = br1.readLine();
        linea2 = br2.readLine();

        while((linea1 != null) || (linea2 != null)){

            if(linea1 != null) {
                bw.write(linea1 + "\n");
                linea1 = br1.readLine();
            }

            if(linea2 != null) {
                bw.write(linea2 + "\n");
                linea2 = br2.readLine();
            }

        }

    }catch (IOException e) {
        System.out.println(e.getClass() + "\n" + e.getMessage());
    }finally {

        if(br1 != null)
            br1.close();

        if(br2 != null)
            br2.close();

        if(bw != null)
            bw.close();


    }

    }
}