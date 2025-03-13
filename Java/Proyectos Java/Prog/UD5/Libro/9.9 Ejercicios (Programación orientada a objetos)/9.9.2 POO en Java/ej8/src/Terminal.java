/**
 * <h1>Terminal.java</h1><hr>
 * Esta clase representa a una terminal, parecen números de teléfono
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class Terminal {

//    Atrib
    private String numero;
    private int tiempo;

//    Constructor
    public Terminal(String numero) {
        this.numero = numero;
        this.tiempo = 0;
    }

//    Gets y Sets
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

//    toString
    @Override
    public String toString() {
        return "Nº " + numero + " - " + tiempo + "s de conversación";
    }

//    Mis Metodos

    /**
     * Incrementa el tiempo de conversación de dos terminales.
     * @param otro La otra terminal.
     * @param seg La cantidad de segundos que se suman
     */
    public void llama(Terminal otro, int seg){
        this.tiempo+=seg;
        otro.tiempo+=seg;
    }
}
