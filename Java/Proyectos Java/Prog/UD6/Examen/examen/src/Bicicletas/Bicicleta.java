package Bicicletas;

/**
 * <h1>Bicicleta.java</h1><hr>
 * <p>Esta clase represanta una bicicleta</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public abstract class Bicicleta {

    private static int num = 0;
    protected String numSerie;
    private String juegoPiezas;

    /**
     * Constructor de Bicicleta
     * @param juegoPiezas marca de las piezas
     */
    public Bicicleta(String juegoPiezas) {
        this.juegoPiezas = juegoPiezas;
        numSerie = "SP" + Bicicleta.num;
        Bicicleta.num++;
    }

    public String getJuegoPiezas() {
        return this.juegoPiezas;
    }

    public String getNumSerie() {
        return this.numSerie;
    }

    public static int getNum() {
        return num;
    }

    /**
     * Clase abstracta que muestra por pantalla como se Realizará el montaje de las distintas
     * bicicletas. Tener en cuenta que el montaje no se puede
     * definir hasta que no se tenga claro el modelo a fabricar.
     */
    public abstract void montarBici();

}
