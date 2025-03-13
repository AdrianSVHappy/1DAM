package Facturas;

import java.time.LocalDate;

/**
 * Esta clase gestiona todo lo relacionado con una factura.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.03
 */
public class Factura {
    private static final int NUM = 5; //Número máximo de elementos en el vector "lineas".
    //Datos de la empresa a indicar en la factura.
    public static final String NOMBRE_E = "El Ratón Rápido, S.A.";
    public static final String CIF_E = "A-000001-C";
    public static final String TELEFONO_E = "611.11.11.11";
    public static final String DIRECCION_E = "C\\ Ratonera, 24";

    public static final String POBLACION_E = "Ratolandia";
    public static final String CP_E = "R00343";
    public static final String PROVINCIA_E = "Ciudad Ratón";
    private String numFactu; //Identificador de la factura.
    private String fecha; //Fecha de creación de la factura.
    private LineaF[] lineas; //Vector que almacena los artículos que componen la factura.
    private Cliente cliente; //Cliente de la factura.
    private int pos; //Indica  la posición que ocupa el próximo objeto en el vector de artículos.
    private float totalSin; //Importe de la factura sin impuestos (IVA).
    private float totalCon; //Importe de la factura con impuestos (IVA).
    private float impuestos; //Total de impuestos en la factura.

    /**
     * Constructor de la clase. En el se instancia el objeto  de la clase "Factura".
     * Tanto la "fecha" como el "vector" de artículos que representan los artículos
     * incluidos en la factura, también se inicializan mediante este constructor
     * de clase.
     *
     * @param numFactu es el identificador de la factura.
     * @param cliente representa el cliente de la factura.
     * @return void.
     *
     */
    public Factura(String numFactu, Cliente cliente) {
        this.numFactu = numFactu;
        this.fecha = LocalDate.now().toString();
        this.lineas = new LineaF[NUM];
        this.cliente = cliente;
        this.pos = 0;
    }

    public String getNumFactu() {
        return numFactu;
    }

    public void setNumFactu(String numFactu) {
        this.numFactu = numFactu;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LineaF[] getLineas() {
        return lineas;
    }

    public void setLineas(LineaF[] lineas) {
        this.lineas = lineas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Este procedimiento se encarga de dar de alta los distintos artículos que integran la factura en el vector,
     * controlando que no supere el número máximo establecido  e incrementa la variable que indica la posición del
     * próximo artículo en dicho vector.
     *
     * @param art artículo objeto de la línea.
     * @param cantidad número de unidades del artículo. Int.
     * @return void.
     *
     */
    public void nuevaLinea(Articulo art, int cantidad){
        if(pos < NUM) {
            this.lineas[pos] = new LineaF(art, cantidad);
            pos++;
        }else{
            System.out.println("ERROR. Superado el número de artículos permitidos");
        }
    }

    /**
     * Procedimiento que realiza el cálculo de la suma del importe de los distintos artículos si incluir los
     * impuestos (IVA).
     *
     * @return Importe de la suma de los artículos sin impuestos (IVA). Float.
     *
     */
    public float totalSinImp(){
        for(LineaF linea : this.lineas) {
            if(linea != null)
                this.totalSin += linea.getTotalSin();
            else
                break;
        }

        return this.totalSin;
    }

    /**
     * Procedimiento que realiza el cálculo de la suma del importe de los distintos artículos incluyendo los
     * impuestos (IVA).
     *
     * @return Importe de la suma de los artículos con los impuestos (IVA). Float.
     *
     */
    public float totalConImp(){
        for(LineaF linea : this.lineas) {
            if(linea != null)
                this.totalCon += linea.getTotal();
            else
                break;
        }

        return this.totalCon;
    }

    /**
     * Procedimiento que realiza el cálculo de la suma del importe de los impuestos (IVA) aplicados a los artículos.
     *
     * @return Importe de la suma del total de los impuestos (IVA). Float.
     *
     */
    public float totalImp(){
        for(LineaF linea : this.lineas) {
            if(linea != null)
                this.impuestos += linea.getTotalSin() * linea.getArt().getIva();
                //o bien: this.impuestos += linea.getTotal() - linea.getTotalSin();
            else
                break;
        }
        return this.impuestos;
    }
}
