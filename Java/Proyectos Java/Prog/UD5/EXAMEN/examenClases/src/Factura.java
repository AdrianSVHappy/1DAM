import java.time.LocalDate;

/**
 * <h1>Factura.java</h1><hr>
 * <p>Esta clase represanta una factura</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Factura {

    //Datos de la empresa
    private final static String nombre = "El Ratón Rápido, S.A.";
    private final static String cif = "5484126R";
    private final static String telefono = "959125478";
    private static String direccion = "Calle Dalí nº9";
    private static String codigoPostal = "21710";
    private static String poblacion = "Bollullos";
    private static String provincia = "Huelva";

    //ID de la factura
    private int identificador;
    private String fecha;
    //Lista de articulos (maximo 5)
    private Articulo[] articulos;
    //Lista de los detalles de los articulos (maximo 5)
    private Detalle[] detalles;
    //Cliente que efectua la compra
    private Cliente cliente;
    private float totalSinIVA;
    private float totalConIVA;
    private float totalIVA;

    /**
     * Constructor de Factura
     * @param identificador Identificador de la factura
     * @param cliente Cliente que hace el pedido
     */
    public Factura(int identificador, Cliente cliente) {
        this.identificador = identificador;
        this.fecha = LocalDate.now().toString();
        this.articulos = new Articulo[5];
        this.detalles = new Detalle[5];
        this.cliente = cliente;
        this.totalSinIVA = 0;
        this.totalConIVA = 0;
        this.totalIVA = 0;
    }

    /**
     * Almacena en un String la información de la factura
     * @return El String con la información
     */
    @Override
    public String toString() {
        String ret = "";

        ret += "Factura:" +
                "\nID: " + identificador +
                "\nFecha: " + fecha +
                "\nEMPRESA: " +
                "\nNombre: " + nombre +
                "\nCIF: " + cif +
                "\nTelefono: " + telefono +
                "\nDireccion: " + direccion +
                "\nCodigoPostal: " + codigoPostal +
                "\nPoblacion: " + poblacion +
                "\nProvincia: " + provincia +
                "\nCliente: " + cliente + "\n";

        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) break;

            ret += articulos[i].toString() + " | " + detalles[i].toString() + "\n";
        }

        ret += "Total sin IVA: " + this.totalSinIVA +
                "\nTotal con IVA: " + this.totalConIVA +
                "\nTotal IVA: " + this.totalIVA + "\n";

        return ret;
    }

    /**
     * Calcula el importe total sin iva segun los articulos de la factura
     */
    public void importeTotalSinIva() {
        float sum = 0;

        for (Detalle detalle : this.detalles) {
            if(detalle == null) break;
            sum += detalle.getPrecioSin();
        }

        this.totalSinIVA = sum;
    }

    /**
     * Calcula el importe total con iva segun los articulos de la factura
     */
    public void importeTotalConIva() {
        float sum = 0;

        for (Detalle detalle : this.detalles) {
            if(detalle == null) break;
            sum += detalle.getPrecioCon();
        }

        this.totalConIVA = sum;
    }

    /**
     * Calcula el iva total segun los articulos de la factura
     */
    public void totalIva() {
        this.totalIVA = this.totalConIVA - this.totalSinIVA;
    }

}
