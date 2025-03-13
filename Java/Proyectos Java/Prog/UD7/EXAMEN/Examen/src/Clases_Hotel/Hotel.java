package Clases_Hotel;

import java.time.LocalDate;
import java.util.*;

/**
 * <h1>Hotel.java</h1><hr>
 * <p>Esta clase represanta un hotel, en la que gestionamos las habitaciones y los clientes</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class Hotel implements Ihotel{

    protected static String nombre = "Hoteles Bollullos";

    private Scanner sc = new Scanner(System.in);
    private HashMap<String, Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;

    public Hotel() {
        StringBuilder cod = new StringBuilder();

        this.habitaciones = new HashMap<String, Habitacion>();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                cod.append(Integer.toString(i)).append(Integer.toString(j));
                this.habitaciones.put(cod.toString(), new Habitacion());
                cod = new StringBuilder();
            }

        }

        this.clientes = new ArrayList<Cliente>();
    }

    @Override
    public void nuevoCliente() throws ExcepcionAltaCliente {
        String direcion;
        String nif;
        String nombre;
        String cp;
        String poblacion;
        String provincia;
        String pais;
        String apellidos;
        String telefono;

        System.out.print("Introduzca el nif: ");
        nif = sc.nextLine();

        if(this.estaCliente(nif))
            throw new ExcepcionAltaCliente();

        System.out.print("Introduzca el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca los apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Introduzca el direccion: ");
        direcion = sc.nextLine();
        System.out.print("Introduzca el cp: ");
        cp = sc.nextLine();
        System.out.print("Introduzca el poblacion: ");
        poblacion = sc.nextLine();
        System.out.print("Introduzca el provincia: ");
        provincia = sc.nextLine();
        System.out.print("Introduzca el pais: ");
        pais = sc.nextLine();
        System.out.print("Introduzca el telefono: ");
        telefono = sc.nextLine();


        clientes.add(new Cliente(direcion, nif, nombre, cp, poblacion, provincia, pais, apellidos, telefono));

    }

    @Override
    public void nuevaLlegada(Cliente cli) throws ExcepcionHabitacionOcupada {
        int dias;
        String cod;
        boolean noexiste = true;

        do{
            System.out.println("indique el codigo de la habitación: ");
            cod = sc.nextLine();

            for (String s : habitaciones.keySet()) {

                if(s.equals(cod)){
                    noexiste = false;
                    break;
                }
            }

            if(noexiste)
                System.out.println("El codigo de habitación establecido no existe en el sistema");

        }while(noexiste);

        if(!this.habitaciones.get(cod).libre())
            throw new ExcepcionHabitacionOcupada();

        System.out.println("Indique el número de dias de ocupación: ");
        dias = sc.nextInt();
        this.habitaciones.get(cod).setCliente(cli);
        this.habitaciones.get(cod).setFecha_entrada(LocalDate.now());

        this.habitaciones.get(cod).setFecha_salida(this.habitaciones.get(cod).getFecha_entrada().plusDays(dias));

    }

    @Override
    public void nuevaSalida(String cod) throws ExcepcionHabitacionLibre {
        boolean noexiste = true;


        for (String s : habitaciones.keySet()) {

            if(s.equals(cod)){
                noexiste = false;
                break;
            }
        }

        if(!noexiste){
        if(this.habitaciones.get(cod).libre())
            throw new ExcepcionHabitacionLibre();

        this.habitaciones.get(cod).iniHabitacion();
        } else{
            System.out.println("El codigo de habitación establecido no existe en el sistema");
        }


    }

    @Override
    public boolean estaCliente(String codCliente) {
        boolean esta = false;

        for (Cliente cliente : clientes) {
            if (cliente.getNif().equals(codCliente)) {
                esta = true;
                break;
            }
        }

        return esta;
    }

    @Override
    public Cliente buscarCliente(String codCliente) throws ExcepcionNoExisteCliente {

        Cliente cli = null;

        for (Cliente cliente : clientes) {
            if(cliente.getNif().equals(codCliente)) {
                cli = cliente;
                break;
            }
        }

        if(cli == null)
            throw new ExcepcionNoExisteCliente();

        return cli;
    }

    @Override
    public void listadoClientes() {

        Collections.sort(clientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    }

    @Override
    public void listadoHabitaciones() {
        for (Map.Entry<String, Habitacion> hab : habitaciones.entrySet()) {

            if(!hab.getValue().libre()){
                System.out.println(hab.getKey() + " " + hab.getValue());
            }

        }
    }
}
