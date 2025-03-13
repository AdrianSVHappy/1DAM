import Facturas.Articulo;
import Facturas.Cliente;
import Facturas.Factura;
import Facturas.LineaF;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>GestorFicheros.java</h1><hr>
 * <p>Esta clase ayuda a la gestión de ficheros</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 26-may-2024
 */

public class GestorFicheros {

    private  String fileName;
    private File myFile;
    private BufferedReader myRead;
    private BufferedWriter myWrite;
    private ArrayList<String> historial;

    public GestorFicheros(String fileName) {
        this.fileName = fileName;
        this.myFile = new File(this.fileName);
        this.myRead = null;
        this.myWrite = null;
        this.historial = new ArrayList<String>();
    }


    public void escribirArchivo(HashMap<String, Cliente> clientes) throws IOException {

        try {
            if (this.myFile.createNewFile()) {
                System.out.println("Se ha creado el fichero: " + this.fileName);
            }

            this.myWrite = new BufferedWriter(new FileWriter(this.fileName, true));

            for (Map.Entry<String, Cliente> aux : clientes.entrySet()) {
                if(!historial.contains(aux.getKey())) {

                    this.myWrite.write(aux.getValue().toString() + "\n");
                    //this.myWrite.write("###\n");
                    System.out.print("-");
                }
            }

            System.out.println("\nDatos de clientes guardados");
        }catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }finally {
            if (this.myWrite != null)
                this.myWrite.close();
        }
    }

    public void escribirArchivo(HashMap<String, Articulo> articulos, HashMap<String, Factura> facturas) throws IOException {

        try {
            if (this.myFile.createNewFile()) {
                System.out.println("Se ha creado el fichero: " + this.fileName);
            }

            this.myWrite = new BufferedWriter(new FileWriter(this.fileName, true));

            for (Map.Entry<String, Factura> factura : facturas.entrySet()) {

                for (LineaF linea : factura.getValue().getLineas()) {

                    articulos.put(linea.getArt().getRef(), new Articulo(linea.getArt().getRef(), linea.getArt().getDescripcion(), linea.getArt().getPrecio(), linea.getArt().getIva()));

                }
            }


            for (Map.Entry<String, Articulo> articulo : articulos.entrySet()) {

                if(!this.historial.contains(articulo.getValue().getRef())){
                    this.myWrite.write(articulo.getValue().getRef() + ";" + articulo.getValue().getDescripcion() + ";" + articulo.getValue().getPrecio() + ";" + articulo.getValue().getIva() + "\n");
                    System.out.print("-");
                }

            }


            System.out.println("\nDatos de articulos guardados");

        }catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }finally {
            if (this.myWrite != null)
                this.myWrite.close();
        }


    }


    public void leerArchivo(HashMap<String, Cliente> map) throws IOException {
        String[] lineas;
        String linea;
        ArrayList<String> componentes = new ArrayList<String>();

        try{
            this.myRead = new BufferedReader(new FileReader(this.fileName));

            linea = this.myRead.readLine();
            System.out.print("\n Cargando clientes (");

            while(linea != null) {
                for (int i = 0; i < 8; i++) {

                    lineas = linea.split(": ");

                    componentes.add(lineas[1]);

                    linea = this.myRead.readLine();
                }

                System.out.print("-");
                this.historial.add(componentes.get(0));
                map.put(componentes.get(0), new Cliente(componentes.get(0), componentes.get(1), componentes.get(2), componentes.get(3), componentes.get(4), componentes.get(5), componentes.get(6), componentes.get(7)));
                componentes.clear();
            }
            System.out.println(")");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(myRead != null)
                myRead.close();

        }


    }

    public void leerArchivo2(HashMap<String, Articulo> articulos) throws IOException {
        String[] lineas;
        String linea;
        try {
            this.myRead = new BufferedReader(new FileReader(this.fileName));
            System.out.print("\n Cargando archivos (");

            linea = this.myRead.readLine();
            while (linea != null) {

                lineas = linea.split(";");

                articulos.put(lineas[0], new Articulo(lineas[0], lineas[1], Float.parseFloat(lineas[2]), Float.parseFloat(lineas[3])));
                System.out.print("-");
                this.historial.add(lineas[0]);
                linea = this.myRead.readLine();
            }
            System.out.println(")");

            for (String s : this.historial) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (myRead != null)
                myRead.close();
        }
    }
}
