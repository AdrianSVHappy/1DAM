import java.io.*;

/**
 * <h1>Ejercicio 5</h1><hr>
 * <p>Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero
 * sin los comentarios.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-may-2024
 */
public class Main {

    private static String RF  = "original.txt";
    private static String WF = "limpio.txt";

    public static void main(String[] args) throws IOException {

        File myFile = new File(RF);
        BufferedReader br = null;
        BufferedWriter bw = null;
        String linea;
        Boolean incluir = true;

        try{
            if(myFile.createNewFile())
                System.out.println("Se ha creado el fichero: " + WF);

            br = new BufferedReader(new FileReader(RF));
            bw = new BufferedWriter(new FileWriter(WF));

            linea = br.readLine();

            while(linea != null){

                if(linea.contains("/*"))
                    incluir = false;

                if(incluir)
                    bw.write(linea + "\n");

                if(linea.contains("*/"))
                    incluir = true;

                linea = br.readLine();
            }


        }catch (IOException e){
            System.out.println(e.getClass() + "\n" + e.getMessage());
        }finally {

            if (br != null)
                br.close();

            if (bw != null)
                bw.close();

        }

    }
}