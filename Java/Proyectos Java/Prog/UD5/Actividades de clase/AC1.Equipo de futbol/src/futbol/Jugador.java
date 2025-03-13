package futbol;
/**
 * <h1>Jugador.java</h1><hr>
 * Esta clase representa un jugador de futbol con todos los metodos receridos por el enunciado
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 20240315
 */
public class Jugador {
//    ATRIBUTO
    /**nombre (String): El nombre del jugador.*/
    private String nombre,
    /**apellido (String): El apellido del jugador.*/
    apellido;

    /**noDorsal (int): El número dorsal del jugador.*/
    private int noDorsal,
    /**mejorPartido (int): Es el número de veces que el jugador ha sido el mejor del partido.*/
    mejorPartido,
    /**noKm (int): Es el número de kilometros totales que ha recorrido un jugador.*/
    noKm,
       /**noPartido (int): Es el número de partidos en los que ha participado el jugador.*/
    noPartido;

//    CONSTRUCTOR
    /**
     * Generar un nuevo jugador <br>
     * Jugador jugador1 = new Jugador(nombre, apellido, noDorsal);<br>
     * @param nombre Nombre del jugador
     * @param apellido Apellido del jugador
     * @param noDorsal Dorsal del jugador*/
    public Jugador(String nombre, String apellido, int noDorsal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.noDorsal = noDorsal;
        //Las variables se inician a 0 en el constructor no en la declaración
        this.noKm=0;
        this.noPartido=0;
        this.mejorPartido=0;
    }

//    MIS METODOS
    /**
     * Incrementa la puntuación<br>
     * jugador1.mejorDelPartido();
     * */
    public void mejorDelPartido(){
        this.mejorPartido++;
    }

    /**
     * Incrementa en 1 el registro de número de km recorridos por partido.
     * @param km El número de km que ha recorrido en el último partido.
     * */
    public void anyadirKm(int km){
//        Body
        this.noKm+=km;
        if (km>0)
            this.noPartido++;
    }

    /**
     * Retorna la media de los km recorridos en todos los partidos jugados.<br>
     * @return FLOAT - media de número kilometros/número partido.
     * */
    public float mediaKm(){
//        Var
        float media;

//        Body
        if(this.noPartido == 0)
            media = 0;
        else
            media = (float)(this.noKm)/(float)(noPartido);

//        Return
        return media;
    }


//    TO STRING

    /**
     * Devuelve la información del jugador.
     * @return STRING - Nombre, apellido, media de km y veces mejor jugador
     */
    @Override
    public String toString() {
        return (this.nombre +" "+ this.apellido +" | "+ mediaKm() +" | "+ this.mejorPartido);
    }

    //    GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public Jugador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Jugador setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int getNoDorsal() {
        return noDorsal;
    }

    public Jugador setNoDorsal(int noDorsal) {
        this.noDorsal = noDorsal;
        return this;
    }

    public int getMejorPartido() {
        return mejorPartido;
    }

    public Jugador setMejorPartido(int mejorPartido) {
        this.mejorPartido = mejorPartido;
        return this;
    }

    public int getNoKm() {
        return noKm;
    }

    public Jugador setNoKm(int noKm) {
        this.noKm = noKm;
        return this;
    }

    public int getNoPartido() {
        return noPartido;
    }

    public Jugador setNoPartido(int noPartido) {
        this.noPartido = noPartido;
        return this;
    }
}

