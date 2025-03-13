package Policia;

/**
 * <h1>Equipo.java</h1><hr>
 * <p>Esta clase represanta un equipo de 5 policias</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */
public class Equipo {

//    Const
    private static final int N = 5;

//    Atrib
    private int id;
    private Agente[] miembros;
    private String ultimoInforme;

//    Constructor
    public Equipo(int id) {
        this.id = id;
        this.miembros = new Agente[N];
        this.ultimoInforme = "No hay datos";
    }

//    Gets y Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agente[] getMiembros() {
        return miembros;
    }

    public void setMiembros(Agente[] miembros) {
        this.miembros = miembros;
    }

    public String getUltimoInforme() {
        return ultimoInforme;
    }

    public void setUltimoInforme(String ultimoInforme) {
        this.ultimoInforme = ultimoInforme;
    }

//    toString
    @Override
    public String toString() {
        String ret = "";

        for (Agente a : miembros) {
            if (a != null)
                ret += a.toString() + "\n";
        }
        ret += "\n" + ultimoInforme + "\n";

        return ret;
    }
}
