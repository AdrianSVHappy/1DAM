package Clases_Hotel;

/**
 * Esta clase para control de los altas de cliente.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class ExcepcionAltaCliente extends Exception{
    ExcepcionAltaCliente(){
        System.out.println("ExcepcionAltaCliente: el cliente ya está dado de alta en el sistema.");
    }
}
