import Facturas.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h1>Programa_Facturacion.java</h1><hr>
 * <p>Esta clase represanta el main del programa</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */


public class Programa_Facturacion {

    static final String CLIF = "clientes.dat";
    static final String ARTF = "articulos.dat";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
        HashMap<String, Factura> facturas = new HashMap<String, Factura>();
        HashMap<String, Articulo> articulosGuardados = new HashMap<String, Articulo>();

        int menu;
        Cliente cliente = null;
        Factura factura = null;
        GestorFicheros clifi = new GestorFicheros(CLIF);
        GestorFicheros artfi = new GestorFicheros(ARTF);

        try {
            clifi.leerArchivo(clientes);
            artfi.leerArchivo2(articulosGuardados);
        }catch (IOException e){
            System.out.println(e.getClass());
        }

        //clientes.put("00", new Cliente("00", "01", "02", "03", "04", "05", "06", "07"));

        do {

            System.out.print("\n\t\t\t\tPROGRAMA DE GESTIÓN DE FACTURAS\n\n" +
                    "\t\t1.- Dar de alta al cliente\n" +
                    "\t\t2.- Crear la factura\n" +
                    "\t\t3.- Mostrar la factura\n" +
                    "\t\t4.- Salir\n\n" +
                    "\tElige una opción: ");
            menu = sc.nextInt();
            sc.nextLine(); //FFLUSH
            switch (menu) {
                case 1:
                    cliente = crearCliente();
                    clientes.put(cliente.getCodigo(), cliente);
                    break;
                case 2:

                    try {

                        factura = crearFactura(clientes);
                        facturas.put(factura.getNumFactu(), factura);

                    }catch (ExcepcionNoCliente e){
                        System.out.println(e.getClass());
                    } finally {
                        break;
                    }
                case 3:

                    try{
                        verFactura(escogerFac(facturas));
                    }catch(ExcepcionNoFactura e){
                        System.out.println(e.getClass());
                    }finally {
                        break;
                    }
                case 4:

                    try {

                        clifi.escribirArchivo(clientes);
                        artfi.escribirArchivo(articulosGuardados, facturas);


                    }catch (IOException e){
                        System.out.println("Error al escribir el fichero");
                    }
                    break;
                case 5:

                    for (Map.Entry<String, Cliente> cli : clientes.entrySet()) {
                        System.out.println(cli.getValue());
                        System.out.println("\n");
                    }

                    break;
                case 6:

                    for (Map.Entry<String, Articulo> art : articulosGuardados.entrySet()) {
                        System.out.println(art.getValue().getRef() + " " + art.getValue().getDescripcion() + " " + art.getValue().getPrecio() + " " + art.getValue().getPrecio());
                    }

                    break;

                default:
                    System.out.println("Error. Opcion no valida.");
            }
            System.out.println("Pulse una \"enter\" para continuar...");
            sc.nextLine();
        } while (menu != 4);


    }

    /**
     * Muestra por pantalla un formulario para crear al cliente.
     *
     * @return El cliente con todos los datos establecidos. Cliente.
     */
    public static Cliente crearCliente() {
        String codigo;
        String nombre;
        String apellidos;
        String direccion;
        String codigoPostal;
        String poblacion;
        String provincia;
        String telefono;

        System.out.println("Indica la siguiente información para dar de alta al cliente: ");
        System.out.print("Código de cliente: ");
        codigo = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellido: ");
        apellidos = sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();
        System.out.print("CP: ");
        codigoPostal = sc.nextLine();
        System.out.print("Poblacion: ");
        poblacion = sc.nextLine();
        System.out.print("Provincia: ");
        provincia = sc.nextLine();
        System.out.print("Telefono: ");
        telefono = sc.nextLine();

        return new Cliente(codigo, nombre, apellidos, direccion, codigoPostal, poblacion, provincia, telefono);
    }

    /**
     * Muestra por pantalla un formulario para que el cliente meta la información de la factura y los productos introducidos
     *
     * @param clis Lista de clientes que pueden comprar los articulos. Cliente
     * @return La factura con todos los datos establecidos. Factura
     */
    public static Factura crearFactura(HashMap<String, Cliente> clis) throws ExcepcionNoCliente {
        Factura nueva;
        String ref;
        String des;
        float precio;
        float iva = 0;
        int cantidad;
        boolean ivaMal; //Bandera para el control de errores del iva
        char otro; //Bandera para añadir mas de un producto


        //Control de excepcion

        if (clis.isEmpty()) {
            throw new ExcepcionNoCliente();
        }

        //


        System.out.print("Indique el número de la factura: ");
        nueva = new Factura(sc.nextLine(), escogerCli(clis));

        System.out.println("\t\tDATOS DEL ARTÍCULO");
        do {
            System.out.print("Referencia artículo: ");
            ref = sc.nextLine();
            System.out.print("Descripción: ");
            des = sc.nextLine();
            System.out.print("Precio: ");
            precio = sc.nextFloat();
            sc.nextLine();

            do {
                ivaMal = false;

                try {
                    System.out.print("IVA (no en % sino en valor numérico): ");
                    iva = Float.parseFloat(sc.nextLine());
                }catch(NumberFormatException e){
                    System.out.println(e.getClass() + "\n" + e.getCause() + "\n" + e.getMessage());
                    ivaMal = true;
                }

                if ((iva != 0.21f) && (iva != 0.1f) && (iva != 0.05f)) {
                    ivaMal = true;
                }
            } while (ivaMal);
            System.out.print("Número de unidades: ");
            cantidad = sc.nextInt();

            nueva.nuevaLinea(new Articulo(ref, des, precio, iva), cantidad);

            System.out.println("Desea introducir otro artículo (S/N)");
            otro = sc.next().charAt(0);
            sc.nextLine(); //FFLUSH
        } while ((otro == 'S' || otro == 's'));


        return nueva;
    }

    /**
     * Muestra por pantalla la factura
     *
     * @param fac La factura que se muestra. Factura
     */
    public static void verFactura(Factura fac) {


        System.out.println(Factura.NOMBRE_E + "\n" +
                Factura.DIRECCION_E + "\n" +
                Factura.CP_E + " " + Factura.POBLACION_E + "\n" +
                Factura.PROVINCIA_E + "\n\n\n\n" +
                "Número de factura: " + fac.getNumFactu() + "\n" +
                "Fecha de la factura: " + fac.getFecha() + "\n\n\n\n" +
                fac.getCliente() + "\n\n\n\n" +
                "Referencia\tArículo\t\t\t\tP.Unitario\tIVA\tCant.\tT. sin IVA\tT. con IVA\n" +
                "________________________________________________________________________________________________________________________________________________\n");
        for (LineaF line : fac.getLineas()) {
            if (line == null) break;
            System.out.printf("%s\t%s\t\t\t\t%.2f\t%.2f\t%d\t%.2f\t%.2f\n",
                    line.getArt().getRef(),
                    line.getArt().getDescripcion(),
                    line.getArt().getPrecio(),
                    line.getArt().getIva(),
                    line.getCantidad(),
                    line.getTotalSin(),
                    line.getTotal());
        }

        System.out.println("\n\n\n\n" +
                "Total (Imp. excluidos): " + fac.totalSinImp() + "\n" +
                "Total impuestos: " + fac.totalImp() + "\n" +
                "Total factura: " + fac.totalConImp() + "\n\n\n");
    }

    private static Cliente escogerCli(HashMap<String, Cliente> clis) {

        String cod;
        Boolean existe;

        System.out.print("Codigos disponibles\n- ");
        for (Map.Entry<String, Cliente> aux : clis.entrySet()) {

            System.out.print(aux.getKey() + " - ");

        }

        do {
            System.out.println("\nIntroduce el codigo del cliente");
            cod = sc.nextLine();

            existe = clis.containsKey(cod);
            if (!existe)
                System.out.println("Ese cliente no existe, introduzca un codigo valido");

        } while (!existe);

        return clis.get(cod);

    }

    private static Factura escogerFac(HashMap<String, Factura> facs) throws ExcepcionNoFactura {
        String cod;
        Boolean existe;


        if (facs.isEmpty()) {
            throw new ExcepcionNoFactura();
        }


        System.out.print("Codigos disponibles\n- ");
        for (Map.Entry<String, Factura> aux : facs.entrySet()) {

            System.out.print(aux.getKey() + " - ");

        }

        do {
            System.out.println("\nIntroduce el codigo de la factura");
            cod = sc.nextLine();

            existe = facs.containsKey(cod);
            if (!existe)
                System.out.println("Esa factura no existe, introduzca un codigo valido");

        } while (!existe);

        return facs.get(cod);
    }


}