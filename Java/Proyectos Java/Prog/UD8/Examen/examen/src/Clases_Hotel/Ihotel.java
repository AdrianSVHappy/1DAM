package Clases_Hotel;

/**
 * Esta clase...
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public interface Ihotel {
    /**
     * Procedimiento que da de alta a un nuevo cliente en el sistema.
     * @throws ExcepcionAltaCliente excepción que se produce si el cliente ya está dado de alta.
     */
    void nuevoCliente() throws ExcepcionAltaCliente;

    /**
     * Asigna un cliente a una habitación durante un periodo concreto de tiempo.
     * @param cli objeto que representa al cliente.
     * @throws ExcepcionHabitacionOcupada excepción que se produce si la habitación ya está ocupada.
     */
    void nuevaLlegada(Cliente cli) throws ExcepcionHabitacionOcupada;

    /**
     * Inicializa el objeto habitación, dejandola libre para otro cliente.
     * @param cod código de la habitación.
     * @throws ExcepcionHabitacionLibre excepción que indica que la habitación ya estaba libre.
     */
    public void nuevaSalida(String cod) throws ExcepcionHabitacionLibre;

    /**
     * Comprueba si el código de cliente existe en el sistema.
     * @param codCliente código del cliente a comprobar.
     * @return false si el código no existe; true en caso contrario.
     */
    boolean estaCliente(String codCliente);

    /**
     * Devuelve un objeto "Cliente" dado su NIF.
     * @param codCliente código del cliente o NIF.
     * @return objeto tipo cliente.
     * @throws ExcepcionNoExisteCliente caso de que no exista el código del cliente.
     */
    Cliente buscarCliente(String codCliente) throws ExcepcionNoExisteCliente;

    /**
     * Realiza un listado por pantalla de todos los clientes en el sistema, ordenados por apellidos. Información:
     * Nif, apellidos, nombre.
     */
    public void listadoClientes();

    /**
     * Realiza el listado de todas las habitaciones que están ocupadas indicando:
     * Código de habitación, apellidos, nombre, fecha entrada, fecha salida.
     */
    public void listadoHabitaciones();



}
