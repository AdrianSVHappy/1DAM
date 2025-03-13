import java.io.*;
import java.util.Scanner;

/**
 * <h1>Ejercicio 6</h1><hr>
 * <p>Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-may-2024
 */
public class Main {

    private static String RF = "fichero.txt";

    public static void main(String[] args) throws IOException {

        File myFile = new File(RF);
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        String linea, palabra;
        int contador = 0;

        try{
            br = new BufferedReader(new FileReader(RF));

            System.out.println("Introduce la palabra que quieres buscar: ");
            palabra = sc.nextLine();

            linea = br.readLine();

            while (linea != null) {

                if(linea.contains(palabra)){
                    contador++;
                }

                linea = br.readLine();

            }


            System.out.println("Total de " + palabra + ": " + contador);

        } catch (FileNotFoundException e){
            System.out.println(e.getClass() + "\n" + e.getMessage());
        }finally {

            if (br != null)
                br.close();

        }

    }
}