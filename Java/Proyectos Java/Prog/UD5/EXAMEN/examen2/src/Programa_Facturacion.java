import Facturas.*;
import java.util.Scanner;

/**
 * <h1>Programa_Facturacion.java</h1><hr>
 * <p>Esta clase represanta el main del programa</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */


public class Programa_Facturacion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        Cliente cliente = null;
        Factura factura = null;

        do {

            System.out.print("\n\t\t\t\tPROGRAMA DE GESTIÓN DE FACTURAS\n\n" +
                    "\t\t1.- Dar de alta al cliente\n" +
                    "\t\t2.- Crear la factura\n" +
                    "\t\t3.- Mostrar la factura\n" +
                    "\t\t4.- Salir\n\n" +
                    "\tElige una opción: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sc.nextLine(); //FFLUSH
                    cliente = crearCliente();
                    break;
                case 2:
                    sc.nextLine(); //FFLUSH
                    factura = crearFactura(cliente);
                    break;
                case 3:
                    verFactura(factura);
                    break;
                case 4:
                    sc.nextLine(); //FFLUSH
                    break;
                default:
                    System.out.println("Error. Opcion no valida.");
                    sc.nextLine(); //FFLUSH
            }
            //sc.nextLine(); //FFLUSH
            System.out.println("Pulse una \"enter\" para continuar...");
            sc.nextLine();
        }while (menu != 4);


    }

    /**
     * Muestra por pantalla un formulario para crear al cliente.
     * @return El cliente con todos los datos establecidos. Cliente.
     */
    public static Cliente crearCliente(){
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
        nombre= sc.nextLine();
        System.out.print("Apellido: ");
        apellidos= sc.nextLine();
        System.out.print("Dirección: ");
        direccion= sc.nextLine();
        System.out.print("CP: ");
        codigoPostal= sc.nextLine();
        System.out.print("Poblacion: ");
        poblacion= sc.nextLine();
        System.out.print("Provincia: ");
        provincia= sc.nextLine();
        System.out.print("Telefono: ");
        telefono= sc.nextLine();

        return new Cliente(codigo, nombre, apellidos, direccion, codigoPostal, poblacion, provincia, telefono);
    }

    /**
     * Muestra por pantalla un formulario para que el cliente meta la información de la factura y los productos introducidos
     * @param cli El cliente que va a comprar los articulos. Cliente
     * @return La factura con todos los datos establecidos. Factura
     */
    public static Factura crearFactura (Cliente cli){
        Factura nueva = null;
        String ref;
        String des;
        float precio;
        float iva;
        int cantidad;
        boolean ivaMal; //Bandera para el control de errores del iva
        char otro; //Bandera para añadir mas de un producto


        if (cli == null){
            System.out.println("Error. Antes de crear la factura, debe crear al cliente");
        }else{
            System.out.print("Indique el número de la factura: ");
            nueva = new Factura(sc.nextLine(), cli);

            System.out.println("\t\tDATOS DEL ARTÍCULO");
            do {
                System.out.print("Referencia artículo: ");
                ref = sc.nextLine();
                System.out.print("Descripción: ");
                des = sc.nextLine();
                System.out.print("Precio: ");
                precio = sc.nextFloat();
                do {
                    ivaMal = false;
                    System.out.print("IVA (no en % sino en valor numérico): ");
                    iva = sc.nextFloat();

                   if ((iva != 0.21f) && (iva != 0.1f) && (iva != 0.05f)) {
                        ivaMal = true;
                        System.out.println("Error. El iva introducido no es valido, prueba con alguno de estos (5%, 10% ó 21%, es decir 0,05, 0,1, 0,21).");
                    }
                }while (ivaMal);
                System.out.print("Número de unidades: ");
                cantidad = sc.nextInt();

                nueva.nuevaLinea(new Articulo(ref, des, precio, iva), cantidad);

                System.out.println("Desea introducir otro artículo (S/N)");
                otro = sc.next().charAt(0);
                sc.nextLine(); //FFLUSH
            }while ((otro == 'S' || otro == 's') );
        }

        return nueva;
    }

    /**
     * Muestra por pantalla la factura
     * @param fac La factura que se muestra. Factura
     */
    public static void verFactura(Factura fac){

        sc.nextLine(); //FFLUSH

        if(fac == null){
            System.out.println("Error. Antes de ver la factura, debe crearla");
        }else{
            System.out.println(Factura.NOMBRE_E + "\n" +
                    Factura.DIRECCION_E + "\n" +
                    Factura.CP_E + " " + Factura.POBLACION_E + "\n" +
                    Factura.PROVINCIA_E + "\n\n\n\n" +
                    "Número de factura: " + fac.getNumFactu() + "\n" +
                    "Fecha de la factura: " + fac.getFecha() + "\n\n\n\n" +
                    fac.getCliente() + "\n\n\n\n" +
                    "Referencia\tArículo\t\t\t\tP.Unitario\tIVA\tCant.\tT. sin IVA\tT. con IVA\n" +
                    "________________________________________________________________________________________________________________________________________________\n");
            for (LineaF line : fac.getLineas()){
                if (line == null) break;
                System.out.printf("%s\t%s\t\t\t\t%.2f\t%.2f\t%d\t%.2f\t%2f\n",
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

    }

}