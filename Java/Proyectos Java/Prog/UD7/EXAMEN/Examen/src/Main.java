import Clases_Hotel.*;
import java.util.Scanner;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta el main del prograa</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int op = 0;

        do {

            System.out.println("\n\n\n\t\t\tPROGRAMA DE GESTION\n\n\n" +
                    "\t\t1.- Dar de alta al cliente\n" +
                    "\t\t2.- Llegadas de clientes\n" +
                    "\t\t3.- Salidas de clientes\n" +
                    "\t\t4.- Listado ordenado de clientes\n" +
                    "\t\t5.- Listado de habitaciones ocupadas\n" +
                    "\t\t6.- Salir\n\n\n" +
                    "\tElige una opción:");

            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getClass() + "\n" + e.getMessage() + "\nError. Debes introducir números enteros" );


            }


            switch (op) {
                case 1:
                    try{
                        hotel.nuevoCliente();
                    } catch (ExcepcionAltaCliente e) {
                        System.out.println("Error. No puede haber dos clientes con el mismo nif");
                    }finally {
                        break;
                    }
                case 2:
                    try {
                        System.out.println("Introduce el codigo del cliente");
                        hotel.nuevaLlegada(hotel.buscarCliente(sc.nextLine()));

                    }catch (ExcepcionNoExisteCliente e){
                        System.out.println("Error. El codigo introducido no corresponde a ningun cliente del sistema");
                    }catch (ExcepcionHabitacionOcupada e){
                        System.out.println("Error. Le codigo de habitación corresponde a una habitación ocupada");
                    }finally {
                        break;
                    }
                case 3:
                    try{
                        System.out.println("Introduce el codigo de la habitación:");
                        hotel.nuevaSalida(sc.nextLine());
                    } catch (ExcepcionHabitacionLibre e) {
                        System.out.println("Error. Le codigo de habitación corresponde a una habitación libre");
                    }finally {
                        break;
                    }
                case 4:
                    hotel.listadoClientes();
                    break;
                case 5:
                    hotel.listadoHabitaciones();
                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("El numero introducino no corresponde con ninguna opción valida");
            }

            System.out.println("\n\nPulse \"Enter\" para continuar....");
            sc.nextLine();

        }while (op != 6);



    }
}