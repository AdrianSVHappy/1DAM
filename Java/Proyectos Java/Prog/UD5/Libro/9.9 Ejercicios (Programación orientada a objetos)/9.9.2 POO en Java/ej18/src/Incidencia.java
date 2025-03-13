/**
 * <h1>Incidencia.java</h1><hr>
 * <p>Esta clase representa a una incidencia</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class Incidencia {

    //    Atrib
    private int codigo, puesto;
    private String estado, informe, resol;

    private static int total, pendientes;

    //    Constructor
    public Incidencia(int puesto, String informe) {
        Incidencia.total += 1;
        Incidencia.pendientes += 1;
        this.codigo = Incidencia.total;
        this.puesto = puesto;
        this.estado = "Pendiente";
        this.informe = informe;
        this.resol = "";
    }

    //    Gets y Sets
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getPuesto() {
        return puesto;
    }
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado (String estado){
            this.estado = estado;
        }
    public String getInforme () {
        return informe;
    }
    public void setInforme (String informe){
        this.informe = informe;
    }
    public static int getTotal () {
        return total;
    }
    public static void setTotal ( int total){
        Incidencia.total = total;
    }
    public static int getPendientes () {
        return pendientes;
    }
    public static void setPendientes ( int pendientes){
        Incidencia.pendientes = pendientes;
    }
    public String getResol() {
        return resol;
    }
    public void setResol(String resol) {
        this.resol = resol;
    }

    //    toString
    @Override
    public String toString() {
        String ret = "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.informe + " - " + this.estado;

        if (this.estado.equals("Resuelta"))
            ret += (" - " + this.resol);

        return ret;
    }

//    Mis metodos

    /**
     * Establece la incidencia como resuelta
     * @param res Informe de como se ha resuelto
     */
    public void resuelve(String res){
        this.resol = res;
        this.estado = "Resuelta";
        Incidencia.pendientes--;

    }
}
