package Clases_Hotel;

/**
 * <h1>ExcepcionNoExisteCliente.java</h1><hr>
 * <p>Esta clase represanta una excepción, cuando asignamos un cliente que no
 * existe a una habitación.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class ExcepcionNoExisteCliente extends Exception {
    public ExcepcionNoExisteCliente() {
        System.out.println("ExcepcionNoExisteCliente: Cuando asignamos un cliente que no existe a una habitación.");
    }
}
