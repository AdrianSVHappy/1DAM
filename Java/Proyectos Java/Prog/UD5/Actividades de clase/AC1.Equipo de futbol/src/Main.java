import futbol.Equipo;
import futbol.Jugador;

import java.util.Scanner;

/**
 * <h1>AC1. Equipo de futbol</h1><hr>
 * <p>La federación de fútbol de tu localidad te ha pedido que le hagas un programa
 * para controlar el rendimiento de los clubs y jugadores. Los requisitos iniciales del
 * programa indican:</p>
 * <br>
 * <h2>REQUISITO 1:</h2>
 * <p>Se debe de poder dar de alta equipos de fútbol a través de un
 * menú inicial en el que se pregunte el nombre del equipo y la división a elegir entre 1
 * "división, 2°división o 3 división</p>
 * <br>
 * <h2>REQUISITO 2:</h2>
 * <p>A través del menú también se deben de poder dar de alta
 * jugadores y asociarlos a uno de los equipos que ya están creados. Cada jugador
 * tendrá Nombre, Apellido y n° de dorsal.</p>
 * <br>
 * <h2>REQUISITO 3:</h2>
 * <p>Se debe de poder mostrar el nombre de los jugadores de un
 * determinado equipo. Para ello en el menú inicial deberás de elegir "Mostrar
 * jugadores por equipo, te mostrará los equipos dados de alta, elegirás uno y mostrará
 * línea a línea todos los jugadores de ese equipo.</p>
 * <br>
 * <h2>REQUISITO 4:</h2>
 * <p>A través del menú se deberá de poder marcar al jugador como
 * "mejor del partido". Por ejemplo, si al jugador se le ha elegido 3 veces como mejor
 * jugador deberá de guardar esas 3 veces.</p>
 * <br>
 * <h2>REQUISITO 5:</h2>
 * <p>A través del menú a cada jugador se le podrá añadir un
 * número de km recorridos en el último partido. Al añadir el n° de km recorridos en el
 * último partido, el programa automáticamente calculará el n° medio de km que
 * recorre un jugador durante cada partido.</p>
 * <br>
 * <h2>REQUISITO 6:</h2>
 * <p>A través del menú, se podrá acceder a una sección llamada
 * "Listar jugadores federados” con la que se deberá de mostrar por pantalla todos los
 * jugadores de la siguiente manera:</p>
 * <p>Equipo | Nombre Apellido | Media km/partido | Veces mejor jugador</p>
 * <hr><br>
 * <h2>OBLIGACIONES:</h2>
 * <p>El programa en su arranque no deberá de tener ningún equipo ni jugador
 * creado. Será el usuario quien vaya añadiendo equipos y jugadores.</p>
 * <p>El uso del programa debe de ser suficientemente intuitivo para que
 * cualquiera sepa utilizarlo una vez le ha dado al play en entorno de desarrollo. Deberá
 * de ser fácil entender cómo usar cada parte del menú</p>
 * <p>Se deberá de ejecutar y poder interactuar con él desde consola a través de
 * entorno de desarrollo.</p>
 * */
public class Main {

    //        CONSTANTES
    /**EQUIPOS (int) El tamaño del vector de equipos*/
    private static final  int EQUIPOS = 3;



    public static void main(String[] args) {

//        Scanner
        Scanner sn = new Scanner(System.in);

//        ATRIBUTOS
        /*menu (int): La usamos para acceder a las distintas partes del switch a modo de menu.*/
        int menu;

        /*equipos (Equipo[]): Vector de equipos.*/
        Equipo equipos[] = new Equipo[EQUIPOS];

//        BODY


        do {
            System.out.print("\nMENU:" +
                    "\n1.- Dar de alta equipos" +
                    "\n2.- Dar de alta jugadores" +
                    "\n3.- Mostrar jugadores por equipo" +
                    "\n4.- Seleccionar al mejor del partido" +
                    "\n5.- Añadir km a un jugador" +
                    "\n6.- Mostrar todos los jugadores" +
                    "\n7.- Salir" +
                    "\n>");
            menu = sn.nextInt();


            switch (menu){
                case 1:
                    System.out.println("\n1.- Dar de alta equipos");
                    altaEquipo(equipos);
                    break;
                case 2:
                    System.out.println("\n2.- Dar de alta jugadores");
                    altaJugador(equipos);
                    break;
                case 3:
                    System.out.println("\n3.- Mostrar jugadores por equipo");
                    mostrarEquipo(equipos);
                    break;
                case 4:
                    System.out.println("\n4.- Seleccionar al mejor del partido");
                    selecMejor(equipos);
                    break;
                case 5:
                    System.out.println("\n5.- Añadir km a un jugador");
                    selecKm(equipos);
                    break;
                case 6:
                    System.out.println("\n6.- Mostrar todos los jugadores");
                    for (Equipo aux : equipos){
                        if(aux==null)
                            break;

                        aux.listarJugadores();
                    }
                    break;
                case 7:
                    System.out.println("\nCerrando programa");
                    break;
                default:

            }


        }while (menu!=7);



    }

//    METODOS
    /**
     * Función para dar de alta un equipo.
     * @param eq
     */
    private static void altaEquipo(Equipo[] eq){
//        Atributos
        int pos = 0, divi;
        String nom;
        Equipo.DIVI realDivi;
        Scanner sn = new Scanner(System.in);

//        Body
        for (Equipo aux : eq){
            if (aux !=null)
                pos++;
            else
                break;
        }

        if (pos >= EQUIPOS)
            System.out.println("No puedes crear más equipos");
        else {
            System.out.println("Nombre del equipo: ");
            nom = sn.nextLine();

            System.out.println("División: ");
            divi = sn.nextInt();
            switch (divi){
                case 1:
                    realDivi = Equipo.DIVI.D1;
                    break;
                case 2:
                    realDivi = Equipo.DIVI.D2;
                    break;
                default:
                    realDivi = Equipo.DIVI.D3;
            }

            eq[pos] = new Equipo(nom, realDivi);

        }

    }

    /**
     * Función que sirve para seleccionar equipos
     * @param eq
     * @return indice del equipo
     */
    private static int escogerEquipo(Equipo[] eq){
//        Atributos
        Scanner sn = new Scanner(System.in);
        int pos=-1, cantidad=-1;
        boolean repetir;


//        Body
        if(eq[0] == null)
            System.out.println("\nNo existe ningun equipo");
        else {
            for (Equipo aux : eq){
                if (aux==null)
                    break;
                else {
                    System.out.println((cantidad+1)+" - "+aux.getNombre());
                    cantidad++;
                }
            }

            do {
                repetir = false;

                System.out.print("\nSelecciona un equipo (0-"+(cantidad)+")\n>");
                pos = sn.nextInt();

                if((pos<0)||(pos>=cantidad)) {
                    System.out.println("El equipo selecionado no existe.");
                    repetir = true;
                }

            }while(repetir);
        }

//        Return
        return pos;
    }

    /**
     * Función para dar de alta un jugador dentro de un equipo
     * @param eq
     */
    private static void altaJugador(Equipo[] eq){
//        Atributos
        int pos;
//        Body

        pos = escogerEquipo(eq);

        if (pos!=-1)
            eq[pos].nuevoJugador();

    }

    /**
     * Función para mostrar los jugadores de un equipo determinado
     * @param eq
     */
    private static void mostrarEquipo(Equipo[] eq){
//        Atributos
        int pos;

//        Body

        pos = escogerEquipo(eq);

        if(pos!=-1)
            eq[pos].listarJugadores();

    }


    /**
     * Función para seleccionar el mejor del partido
     * @param eq
     */
    private static void selecMejor(Equipo[] eq){
//        Atributo
        int pos;

//        Body
        pos = escogerEquipo(eq);

        if (pos !=-1)
            eq[pos].mejorDelPartido();
    }

    /**
     * Funcion para seleccionar un equipo para modificar los km recorridos por sus jugadores
     * @param eq
     */
    private static void selecKm(Equipo[] eq){
//        Atributos
        int pos;

//        Body
        pos = escogerEquipo(eq);

        if(pos!=-1)
            eq[pos].anyadirKm();

    }

}