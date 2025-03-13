/**
 * <h1>FichaDomino.java</h1><hr>
 * <p>Esta clase representa a una ficha de domino</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class FichaDomino {
//    Atrib
    private int numIzq, numDer;

//    Constructor
    public FichaDomino(int numIzq, int numDer) {
        this.numIzq = numIzq;
        this.numDer = numDer;
    }

//    Gets y Sets
    public int getNumIzq() {
        return numIzq;
    }

    public void setNumIzq(int numIzq) {
        this.numIzq = numIzq;
    }

    public int getNumDer() {
        return numDer;
    }

    public void setNumDer(int numDer) {
        this.numDer = numDer;
    }

//    toString
    @Override
    public String toString() {
        String izq = " ", der = " ";

        if (this.numIzq != 0)
            izq = Integer.toString(this.numIzq);
        if (this.numDer != 0)
            der = Integer.toString(this.numDer);

        return "[" + izq + "|" + der + "]";
    }

//    Mis metodos

    /**
     * Da la vuelta a la ficha
     * @return [numIzq|numDer]
     */
    public String voltea(){
        int aux;

        aux = this.numIzq;
        this.numIzq = this.numDer;
        this.numDer = aux;

        return this.toString();
    }

    /**
     * Comprueba si dos fichas encajan
     * @param otra la otra ficha
     * @return true si encajan | fasle si no
     */
    public boolean encaja(FichaDomino otra){
        boolean ret;

        if (
            (this.numIzq == otra.numIzq) ||
            (this.numDer == otra.numDer) ||
            (this.numIzq == otra.numDer) ||
            (this.numDer == otra.numIzq)
        )
            ret = true;
        else ret = false;

        return ret;

    }

}
