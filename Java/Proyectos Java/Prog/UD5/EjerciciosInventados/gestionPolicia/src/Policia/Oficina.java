package Policia;
/**
 * <h1>Oficina.java</h1><hr>
 * <p>Esta clase represanta una oficina</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */
public class Oficina {

//    Const
    private static final String LOCALIDAD = "Bollullos";
    private static final int EQUIPOS = 3;
    private static final int ARMAS = 50;
    private static final int VEHICULOS = 10;

//    Atrubutos
    private float sueldos;
    private Equipo[] equipos;
    private Arma[] armas;
    private Vehiculo[] vehiculos;

//    Constructor
    public Oficina() {
        this.sueldos = 0;
        this.equipos = new Equipo[EQUIPOS];
        this.armas = new Arma[ARMAS];
        this.vehiculos = new Vehiculo[VEHICULOS];
    }

//    Gets y Sets
    public float getSueldos() {
        return sueldos;
    }

    public void setSueldos(float sueldos) {
        this.sueldos = sueldos;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public void setArmas(Arma[] armas) {
        this.armas = armas;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

//    Metodos auxiliares
    /**
     * Busca la primera posición del vector vacia para poder introducir información
     * @param obj el vector en el que se busca : Object
     * @return (int) la posición libre | si devuelve -1 significa que no se ha encontrado
     */
    private static int huecoLibre(Object[] obj){
        int pos = 0;

        for(Object o : obj){
            if (o == null){
                break;
            }
            pos++;
        }

        if(pos == obj.length){
            pos = -1;
        }

        return pos;
    }

    /**
     * Almacena la información de los objetos que no son null y los almacena en un String
     * @param obj el vector en el que se busca : Object
     * @return (String) Lista de información
     */
    public static String listar(Object[] obj){
        String respuesta = "";

        for(Object o : obj){
            if(o != null)
                respuesta += o + "\n";
        }

        return respuesta;
    }

    /**
     * Busca la posición de un objeto en un vector a partir de su atributo identificador
     * @param vector El vector donde se realiza la busqueda : Equipo
     * @param id El identificador que se busca : int
     * @return (int) La posición en la que se encuentra el objeto dentro del vector | si devuelve -1 significa que no se ha encontrado
     */
    private static int buscarEquipo (Equipo[] vector, int id){
        int pos = 0;

        for (Equipo obj : vector){

            if (obj == null)
                continue;

            if(obj.getId() == id)
                break;

            pos ++;
        }

        if (pos >= vector.length)
            pos = -1;

        return pos;
    }

//    Otros metodos
    public void crearEquipo(Equipo equipo) {
        this.equipos[huecoLibre(equipos)] = equipo;
    }

    public boolean comprarArmas(){
        int cantArmas = (int)(Math.random()*20)+10;
        int tipo;
        boolean correcto = (huecoLibre(this.armas) != -1); //Si es distinto de -1 se iguala a true y si es igual se pone falsa

        if(correcto) {
            if ((this.armas.length - huecoLibre(this.armas)) < cantArmas) {
                cantArmas =  (this.armas.length - huecoLibre(this.armas));
            }

            for (int i = 0; i < cantArmas; i++) {
                tipo = (int)(Math.random()*3);

                switch (tipo) {
                    case 0:
                        this.armas[huecoLibre(this.armas)] = new Arma(huecoLibre(this.armas), TipoArma.PISTOLA);
                        break;
                    case 1:
                        this.armas[huecoLibre(this.armas)] = new Arma(huecoLibre(this.armas), TipoArma.RIFLE);
                        break;
                    case 2:
                        this.armas[huecoLibre(this.armas)] = new Arma(huecoLibre(this.armas), TipoArma.CUCHILLO);
                        break;
                }
            }
        }

        return correcto;
    }

    public boolean comprarVehiculos() {
        int cantVehiculos = (int)(Math.random()*6)+1;
        int tipo;
        boolean correcto = (huecoLibre(this.vehiculos) != -1);

        if(correcto) {
            if ((this.vehiculos.length - huecoLibre(this.vehiculos)) < cantVehiculos) {
                cantVehiculos = (this.vehiculos.length - huecoLibre(this.vehiculos));
            }

            for (int i = 0; i < cantVehiculos; i++) {
                tipo = (int)(Math.random()*3);
                switch (tipo) {
                    case 0:
                        this.vehiculos[huecoLibre(this.vehiculos)] = new Vehiculo(("" + huecoLibre(this.vehiculos)), TipoVehiculo.TODOTERRENO);
                        break;
                    case 1:
                        this.vehiculos[huecoLibre(this.vehiculos)] = new Vehiculo(("" + huecoLibre(this.vehiculos)), TipoVehiculo.COCHE);
                        break;
                    case 2:
                        this.vehiculos[huecoLibre(this.vehiculos)] = new Vehiculo(("" + huecoLibre(this.vehiculos)), TipoVehiculo.MOTO);
                }
            }
        }

        return correcto;
    }

    public boolean contratarAgente(int equipo, Agente nuevo){
        boolean correcto = (equipo != -1);

        if (correcto)
            this.equipos[equipo].getMiembros()[(huecoLibre(this.equipos[equipo].getMiembros()))] = nuevo;

        return correcto;
    }

    public void mision(int equipo, int agente1, int agente2,int arma1, int arma2, int vehiculo){

        String informe = "";

        informe += "INFORME\n" +
                "Los agentes del equipo Nº" + this.equipos[equipo].getId() +":\n" +
                "- (" + this.equipos[equipo].getMiembros()[agente1] + "\n" +
                "- (" + this.equipos[equipo].getMiembros()[agente2] + "\n" +
                "----------------------------------------------\n\n" +
                "Armas:\n- " + this.armas[arma1] + "\n- " + this.armas[arma2] + "\n" +
                "----------------------------------------------\n\n" +
                "Vehiculo:\n- " + this.vehiculos[vehiculo] + "\n" +
                "----------------------------------------------\n\n" +
                "MISION:\n";

        if ((int)(Math.random()*2) == 0) {
            if(!this.armas[arma1].disparar())
                informe += "El agente " + this.equipos[equipo].getMiembros()[agente1].getNombre() + " no pudo usar su arma\n";
        }

        if ((int)(Math.random()*2) == 0) {
            if (!this.armas[arma2].disparar())
                informe += "El agente " + this.equipos[equipo].getMiembros()[agente2].getNombre() + " no pudo usar su arma\n";

            if (!this.vehiculos[vehiculo].conducir()) {
                informe += "- Comprar gasolina gasolina\n";
                this.vehiculos[vehiculo].conducir();
            }

            informe += "RESULTADO\n" +
                    "Los agentes del equipo Nº" + this.equipos[equipo].getId() + ":\n" +
                    "- (" + this.equipos[equipo].getMiembros()[agente1] + "\n" +
                    "- (" + this.equipos[equipo].getMiembros()[agente2] + "\n" +
                    "----------------------------------------------\n\n" +
                    "Armas:\n- " + this.armas[arma1] + "\n- " + this.armas[arma2] + "\n" +
                    "----------------------------------------------\n\n" +
                    "Vehiculo:\n- " + this.vehiculos[vehiculo] + "\n";

            this.equipos[equipo].setUltimoInforme(informe);
        }
    }
}
