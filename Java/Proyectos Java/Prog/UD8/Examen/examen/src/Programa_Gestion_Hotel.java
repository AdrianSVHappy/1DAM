import Clases_Hotel.*;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

/**
 * Esta clase...
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 2024.05
 */
public class Programa_Gestion_Hotel {

    public static final String CLIF = "DatosCliente.dat";
    public static final String HABF = "DatosHabitacion.dat";

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        String codCliente = null; //código del cliente a gestinar.
        String codHabitacion = null; //código de la habitación a gestionar.
        int op = 0; //Opción del menú.

        File cliFi = new File(CLIF);
        File habFi = new File(HABF);

        try {
            if (!cliFi.exists()) {
                cliFi.createNewFile();
                System.out.println("Se ha creado el fichero: " + CLIF);
            }

            if (!habFi.exists()) {
                habFi.createNewFile();
                System.out.println("Se ha creado el fichero: " + HABF);
            }
        }catch (IOException e){
            System.out.println(e.getClass() + ": " + e.getCause());
        }


        try{
            cargaDatosCliente(br, hotel);
        } catch (RuntimeException re) {
            System.out.println(re.getClass() + ": " + re.getCause());
        }


        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Menú principal
        do{
            System.out.printf("\t\t\t\t PROGRAMA DE GESTIÓN DE HOTELES\n");
            System.out.println();
            System.out.println();
            System.out.printf("\t\t 1.- Dar de alta al cliente\n");
            System.out.printf("\t\t 2.- Llegadas de clientes\n");
            System.out.printf("\t\t 3.- Salidas de clientes\n");
            System.out.printf("\t\t 4.- Listado ordenado de clientes\n");
            System.out.printf("\t\t 5.- Listado de habitaciones ocupadas\n");
            System.out.printf("\t\t 6.- Listado historico de habitaciones ocupadas\n");
            System.out.println("\t\t 7.- Salir\n");
            System.out.println();
            System.out.println();
            System.out.print("      Elige una opción: ");
            try {
                op = Integer.parseInt(sc.nextLine());

                System.out.print("\033[H\033[2J");
                System.out.flush();

                switch (op){
                    case 1: //Para dar de alta a un cliente.
                        try {
                            System.out.flush();
                            hotel.nuevoCliente();
                        }catch(ExcepcionAltaCliente eac){
                            System.out.println("Se ha producido un error al dar de alta al cliente.");
                        }
                        break;
                    case 2: //Llegadas de clientes a habitaciones.
                        try {
                            System.out.print("Introduzca el código del cliente: ");
                            System.out.flush();
                            codCliente = sc.nextLine();
                            System.out.flush();
                            hotel.nuevaLlegada(hotel.buscarCliente(codCliente));
                        }catch (ExcepcionHabitacionOcupada eho){
                            System.out.println("Error. Problemas con la habitación");
                        }catch (ExcepcionNoExisteCliente enec){
                            System.out.println("Error. Problemas con el código del cliente.");
                        }
                        break;
                    case 3: //Salidas de clientes de las habitaciones.
                        try {
                            System.out.flush();
                            System.out.printf("Indique código de la habitación: ");
                            codHabitacion = sc.nextLine();
                            System.out.flush();
                            hotel.nuevaSalida(codHabitacion);
                        }catch (ExcepcionHabitacionLibre ehl){
                            System.out.println("Error. Problemas con el código de la habitación.");
                        }
                        break;
                    case 4:
                        hotel.listadoClientes();
                        break;
                    case 5:
                        hotel.listadoHabitaciones();
                        break;
                    case 6:
                        try{
                            mostrarHistoricoHabitacion(br, hotel);
                        } catch (RuntimeException re) {
                            System.out.println(re.getClass() + ": " + re.getCause());
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Error. Opción no válida");
                }
            }catch (NumberFormatException nfe){
                System.out.println("CUIDADO. Debes introducir números enteros.");
            }
            System.out.flush();
            System.out.println("Pulse \"ENTER\" para continuar...");
            sc.nextLine();
            //Para limpiar la pantalla.
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (op != 7);

        try{
            volcarDatosCliente(bw, hotel);
            volcarDatosHabitacion(bw, hotel);
        }catch (RuntimeException re){
            System.out.println(re.getClass() + ": " + re.getCause());
        }

    }

    /**
     * Realiza el volcado de información desde la estructura correspondiente del objeto "hotel" de la clase "Hotel" al fichero.
     * @param bwC Descriptor del buffer para lectura del fichero de datos
     * @param hotel objeto de clase Hotel
     * @throws RuntimeException
     */
    static void volcarDatosCliente(BufferedWriter bwC, Hotel hotel) throws RuntimeException{

        try {

            bwC = new BufferedWriter(new FileWriter(CLIF));

            for (Cliente cliente : hotel.getClientes()) {

                bwC.write(cliente.getNif() + ";" +
                        cliente.getNombre() + ";" +
                        cliente.getApellidos() + ";" +
                        cliente.getTelefono() + ";" +
                        cliente.getDireccion() + ";" +
                        cliente.getCp() + ";" +
                        cliente.getPoblacion() + ";" +
                        cliente.getProvincia() + ";" +
                        cliente.getPais() + "\n");
            }

        }catch (IOException ioe){
            System.out.println(ioe.getClass() + ": " + ioe.getCause());
        }finally {
            try{
                bwC.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * Para realizar el volcado de los datos de los clientes desde el fichero "DatosClient.dat" a la estructura correspondiente del objeto "Hotel"
     * @param brC Descriptor del buffer para escritura del fichero de datos
     * @param hotel objeto de la clase Hotel
     * @throws RuntimeException
     */
    static void cargaDatosCliente(BufferedReader brC, Hotel hotel) throws RuntimeException {

        String linea;
        String[] trozos;

        try {

            brC = new BufferedReader(new FileReader(CLIF));

            linea = brC.readLine();

            while (linea != null) {
                trozos = linea.split(";");

                hotel.cargarCliente(new Cliente(trozos[0], trozos[1], trozos[2], trozos[3], trozos[4], trozos[5], trozos[6], trozos[7], trozos[8]));

                linea = brC.readLine();
            }


        } catch (IOException ioe) {
            System.out.println(ioe.getClass() + ": " + ioe.getCause());
        } finally {
            try {
                brC.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Realiza el volcado de datos de Habitacones en el fichero de histórico
     * @param bwH Descriptor del buffer para escritura del fichero de datos
     * @param hotel objeto clase Hotel
     * @throws RuntimeException
     */
    static void volcarDatosHabitacion(BufferedWriter bwH, Hotel hotel) throws RuntimeException{

        try{
         bwH = new BufferedWriter(new FileWriter(HABF, true));

            for (Map.Entry<String, Habitacion> hab : hotel.getHabitaciones().entrySet()) {

                if (!hab.getValue().libre()) {
                    bwH.write(hab.getKey() + " " +
                            hab.getValue().getFecha_entrada() + " " +
                            hab.getValue().getFecha_salida() + " " +
                            hab.getValue().getCliente().getNif() + "\n");
                }
            }

        }catch (IOException ioe){
            System.out.println(ioe.getClass() + ": " + ioe.getCause());
        } finally {
            try {
                bwH.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


    /**
     * Realiza un listado del histórico de habitaciones ocupadas del hotel
     * @param brH Descriptor del buffer para lectura del fichero de datos
     * @param hotel objeto clase Hotel
     * @throws RuntimeException
     */
    static void mostrarHistoricoHabitacion(BufferedReader brH, Hotel hotel) throws RuntimeException {
        String linea;

        try{
            brH = new BufferedReader(new FileReader(HABF));

            System.out.println("\t\t LISTADO HISTORICO DE HABITACIONES\n" +
                                "\t\t _________________________________\n\n" +
                                "Codigo F.Entrada F.Salida Cliente\n" +
                                "____________________________________________");

            linea = brH.readLine();

            while (linea != null){

                System.out.println(linea);

                linea = brH.readLine();
            }

        }catch (IOException ioe){
            System.out.println(ioe.getClass() + ": " + ioe.getCause());
        } finally {
            try {
                brH.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
