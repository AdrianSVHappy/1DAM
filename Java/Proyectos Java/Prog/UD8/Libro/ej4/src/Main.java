import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Ejercicio 4</h1><hr>
 * <p>Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-may-2024
 */
public class Main {

    private static String RF = "palabras.txt";
    private static String WF = "palabras_sort.txt";

    public static void main(String[] args) throws IOException {

        File myFile = new File(WF);
        BufferedReader br = null;
        BufferedWriter bw = null;
        String linea;
        ArrayList<String> list = new ArrayList<String>();

        try{
            if(myFile.createNewFile()){
                System.out.println("Se ha creado el fichero: " + WF);
            }

            br = new BufferedReader(new FileReader(RF));
            bw = new BufferedWriter(new FileWriter(WF));

            linea = br.readLine();

            while(linea != null){
                list.add(linea);
                linea = br.readLine();
            }

            Collections.sort(list);

            for (String s : list) {
                bw.write(s + "\n");
            }


        }catch (InterruptedIOException e){
            System.out.println(e.getClass() + "\n" + e.getMessage());
        }finally {

            if(br != null)
                br.close();

            if(bw != null)
                bw.close();

        }

    }
}