package futbol;
import java.util.Scanner;

/**
 * <h1>Equipo.java</h1><hr>
 * Esta clase representa a un equípo de futbol y los metodos requeridos por el enunciado.
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 20240315
 */
public class Equipo {

//    CONST
    /**N (int): El tamaño del vector de Jugadores.*/
    private final static int N = 5;

    /**DIVI (enum): Establece las únicas divisiones (D1, D2, D3)*/
    public enum DIVI{
        D1, D2, D3;
    }

//    SCANNER
    /**sn (Scanner): Lo usamos para pedir información por pantalla.*/
    private Scanner sn = new Scanner(System.in);

//    ATRUBUTO
    /**nombre (string): El nombre del equipo.*/
    private String  nombre;
    /**division: Usando el enumerado DIVI, se establece la división del equipo*/
    private DIVI division;
    /**jugadores (Jugador[]): El vector donde se almacenan los jugadores del equipo.*/
    private Jugador[] jugadores = new Jugador[N];

//    MIS METODOS
    /**Crear un nuevo jugador mediante un pequeño formulario.*/
    public void nuevoJugador(){
//        ATRIBUTOS
        Scanner sn = new Scanner(System.in);
        String nombre, apellido;
        int dorsal, pos=-1;
//        BODY

        sn.nextLine();//FFLUSH
        System.out.print("Nombre del jugador: ");
        nombre = sn.nextLine();
        sn.nextLine();
        System.out.print("Apellido del jugador: ");
        apellido = sn.nextLine();
        sn.nextLine();
        System.out.print("Dorsal del jugador: ");
        dorsal = sn.nextInt();

        for (int i = 0; i < this.jugadores.length; i++) {
            if(this.jugadores[i]==null){
                pos = i;
                break;
            }
        }
        if(pos!=-1)
            this.jugadores[pos] = new Jugador(nombre, apellido, dorsal);
        else
            System.out.println("Ya no caben más jugadores en este equipo");

    }

    /**Muestra por pantalla todos los jugadores de este equipo*/
    public void listarJugadores(){
//        Atributos

//        Body
        for (Jugador jugadore : this.jugadores) {
            if (jugadore == null)
                break;
            else {
                System.out.println(this.nombre + " | " + jugadore);
            }
        }


    }

    /**Menú para escoger el jugador de un equipo.*/
    private int elegirJugador(){
//        Atributo
        int i, res;
//        Body
        for (i = 0; i < this.jugadores.length; i++) {
            if(this.jugadores[i]==null)
                break;
            else
                System.out.println(i+" | "+this.jugadores[i].toString());
        }

        do {
            System.out.println("Que jugador quieres seleccionar? (0-"+(i-1)+")");
            res = sn.nextInt();
        } while ((res > i)||(res<0));

        return res;

    }


    /**Escoger el jugador que ha sido el mejor del partido.*/
    public void mejorDelPartido(){
        //atributos

        int pos;

        //Body

        pos = this.elegirJugador();

        if (pos>=0)
            this.jugadores[pos].mejorDelPartido();
        else
            System.out.println("Jugador no encontrado");

    }

    /**Escoger a un jugador para incrementar el número de km recorridos*/
    public void anyadirKm(){

        //ATRIBUTO
        int pos, cantidad;

        //BODY
        pos = this.elegirJugador();

        if (pos>=0) {
            System.out.println("Cuantos km ha recorrido " + this.jugadores[pos].getNombre() + "?");
            cantidad = sn.nextInt();
            this.jugadores[pos].anyadirKm(cantidad);
        }else
            System.out.println("Jugador no encontrado");


    }

//    Constructor
    public Equipo(String nombre, DIVI division) {
        this.nombre = nombre;
        this.division = division;
    }

//    toString

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + this.nombre + '\'' +
                ", division=" + this.division +
                '}';
    }


//    Getter y setter

    public int getN() {
        return N;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DIVI getDivision() {
        return division;
    }

    public Equipo setDivision(DIVI division) {
        this.division = division;
        return this;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public Equipo setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
        return this;
    }
}
