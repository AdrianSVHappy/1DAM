package Facturas;

/**
 * <h1>ExcepcionNoCliente.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 20-may-2024
 */
public class ExcepcionNoCliente extends Exception{
    public ExcepcionNoCliente(){
        System.out.println("ExcepcionNoCliente: No se encontró ningun cliente");
    }
}
