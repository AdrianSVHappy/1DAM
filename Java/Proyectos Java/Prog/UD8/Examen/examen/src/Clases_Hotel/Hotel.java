package Clases_Hotel;

import java.time.LocalDate;
import java.util.*;


/**
 * Esta clase representa al hotel y toda su funcionalidad.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class Hotel implements Ihotel {
    private Scanner sc;
    static protected String nombre = "Gran Hotel de Bollullos Cdo.";
    private HashMap<String, Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;

    /**
     * Constructor de la clase. Sin parámetros.
     * Crea todas las habitacines del hotel, desde la 11-15 (primera planta) a la 41-45 (cuarta planta).
     * En total 20 habitaciones.
     */
    public Hotel(){
        this.sc = new Scanner(System.in);
        this.clientes = new ArrayList<Cliente>();
        this.habitaciones = new HashMap<String, Habitacion>();
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 6; j++){
                habitaciones.put(String.valueOf(i) + String.valueOf(j), new Habitacion());
            }
        }
    }

    public HashMap<String, Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Procedimiento que da de alta a un nuevo cliente en el sistema.
     * @throws ExcepcionAltaCliente excepción que se produce si el cliente ya está dado de alta.
     */
    public void nuevoCliente() throws ExcepcionAltaCliente{
        String nif;
        String nombre;
        String apellidos;
        String telefono;
        String direccion;
        String cp;
        String poblacion;
        String provincia;
        String pais;

        System.out.flush();
        System.out.println("Indica la siguiente información para dar de alta al cliente: ");
        System.out.print("Código de cliente: ");
        nif = sc.nextLine();

        //Si el código ya existe, lanzamos la excepción.
        if(estaCliente(nif))
            throw new ExcepcionAltaCliente();

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();

        System.out.print("Dirección: ");
        direccion = sc.nextLine();

        System.out.print("Código postal: ");
        cp = sc.nextLine();

        System.out.print("Población: ");
        poblacion = sc.nextLine();

        System.out.print("Provincia: ");
        provincia = sc.nextLine();

        System.out.print("Teléfono: ");
        telefono = sc.nextLine();

        System.out.print("País: ");
        pais = sc.nextLine();

        this.clientes.add(new Cliente(nif, nombre, apellidos, telefono, direccion, cp, poblacion, provincia, pais));
    }

    /**
     * Asigna un cliente a una habitación durante un periodo concreto de tiempo.
     * @param cli objeto que representa al cliente.
     * @throws ExcepcionHabitacionOcupada excepción que se produce si la habitación ya está ocupada.
     */
    public void nuevaLlegada(Cliente cli) throws ExcepcionHabitacionOcupada{
        String cod;
        int dias;

        do{
            System.out.flush();
            System.out.print("Indique el código de la habitación: ");
            cod = sc.nextLine();
            System.out.flush();
            if (this.habitaciones.get(cod) == null) {
                System.out.println("Error. no existe el código de la habitación.");
            }
        }while (this.habitaciones.get(cod) == null);

        if(this.habitaciones.get(cod).libre()) {
            System.out.print("Indique el número de días de ocupación: ");
            dias = sc.nextInt();
            this.habitaciones.get(cod).setCliente(cli);
            this.habitaciones.get(cod).setFecha_entrada(LocalDate.now());
            this.habitaciones.get(cod).setFecha_salida(this.habitaciones.get(cod).getFecha_entrada().plusDays(dias));
        }else{
            throw new ExcepcionHabitacionOcupada();
        }

    }

    /**
     * Inicializa el objeto habitación, dejandola libre para otro cliente.
     * @param cod código de la habitación.
     * @throws ExcepcionHabitacionLibre excepción que indica que la habitación ya estaba libre.
     */
    public void nuevaSalida(String cod) throws ExcepcionHabitacionLibre{
        if(this.habitaciones.get(cod) != null) {
            if(!this.habitaciones.get(cod).libre()) {
                this.habitaciones.get(cod).iniHabitacion();
                System.out.println("Habitación liberada.");
            }else{
                throw new ExcepcionHabitacionLibre();
            }
        }else{
            System.out.println("ERROR. No existe la habitación.");
        }
    }

    /**
     * Comprueba si el código de cliente existe en el sistema.
     * @param codCliente código del cliente a comprobar.
     * @return false si el código no existe; true en caso contrario.
     */
    public boolean estaCliente(String codCliente){
        boolean sal = false;
        for(Cliente cli : clientes){
            if(codCliente.equals(cli.getNif()))
                sal = true;
        }
        return sal;
    }

    /**
     * Devuelve un objeto "Cliente" dado su NIF.
     * @param codCliente código del cliente o NIF.
     * @return objeto tipo cliente.
     * @throws ExcepcionNoExisteCliente caso de que no exista el código del cliente.
     */
    public Cliente buscarCliente(String codCliente) throws ExcepcionNoExisteCliente{
        Cliente cliente = null;

        for(Cliente cli : clientes) {
            if (cli.getNif().equals(codCliente)) {
                cliente = cli;
                break;
            }
        }
        if(cliente == null){
            throw new ExcepcionNoExisteCliente();
        }

        return cliente;
    }

    /**
     * Realiza un listado por pantalla de todos los clientes en el sistema, ordenados por apellidos. Información:
     * Nif, apellidos, nombre.
     */
    public void listadoClientes(){
        Collections.sort(clientes); //ordenamos los clientes por apellidos.
        System.out.println("NIF          APELLIDOS        NOMBRE      ");
        System.out.println("------------------------------------");
        for(Cliente cli : clientes){
            System.out.println(cli);
        }
        System.out.println();
    }

    /**
     * Realiza el listado de todas las habitaciones que están ocupadas indicando:
     * Código de habitación, apellidos, nombre, fecha entrada, fecha salida.
     */
    public void listadoHabitaciones(){
        Habitacion hab = null;
        System.out.println("COD.  APELLIDOS   NOMBRE   F.ENT. F.SAL.");
        System.out.println("-----------------------------------------------");
        for(Map.Entry par : habitaciones.entrySet()){
            hab = (Habitacion) par.getValue();
            if(!hab.libre())
                System.out.println(par.getKey() + "  " + hab);
        }
        System.out.println();
    }

    /**Realiza la carga de clientes uno uno en el array list de cliente
     * @param cli Cliente
     */
    public void cargarCliente(Cliente cli) {

        this.clientes.add(cli);
    }



}
