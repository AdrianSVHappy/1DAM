package Clases_Hotel;

/**
 * Esta clase...
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class ExcepcionNoExisteCliente extends Exception{
    ExcepcionNoExisteCliente(){
        System.out.println("ExcepcionNoExisteCliente: no existe el cliente en el sistema.");
    }
}
