package Clases_Hotel;

/**
 * <h1>ExcepcionAltaCliente.java</h1><hr>
 * <p>Esta clase represanta una excepción, en caso de que demos de alta un cliente que ya existe en el sistema.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class ExcepcionAltaCliente extends Exception {

    public ExcepcionAltaCliente() {
        System.out.println("ExcepcionAltaCliente: Caso de que demos de alta un cliente que ya existe en el sistema.");
    }
}
