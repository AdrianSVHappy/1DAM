package Facturas;

/**
 * <h1>ExcepcionNoFactura.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 20-may-2024
 */
public class ExcepcionNoFactura extends Exception{
    public ExcepcionNoFactura(){
        System.out.println("ExcepcionNoFactura: No se encontró ninguna factura");
    }
}
