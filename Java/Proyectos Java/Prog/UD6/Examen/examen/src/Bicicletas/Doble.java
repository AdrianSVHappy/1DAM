package Bicicletas;

/**
 * <h1>Doble.java</h1><hr>
 * <p>Esta clase represanta una bicicleta doble</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public class Doble extends Simple{

    private String amortiguador;
    private String numSerie;

    public Doble(String juegoPiezas, String barras, String amortiguador) {
        super(juegoPiezas, barras);
        this.amortiguador = amortiguador;
        this.numSerie = ((Bicicleta)this).numSerie + "D";
    }

    @Override
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Se muestra por pantalla que se ha montado el amortiguador
     */
    public void montarAmortiguador(){
        System.out.println("Ya he montado el amortiguador " + this.amortiguador + " en la bici");
    }

    /**
     * Se muestra por pantalla que se ha probado el amortiguador
     */
    public void probarAmortiguador(){
        System.out.println("Ya He probado el amortiguador " + this.amortiguador + " y funciona bien") ;
    }

    @Override
    public void montarBici() {
        System.out.println("Ya he montado la bici de tipo \"Bicicletas.Doble\", incluyendo la horquilla " + ((Simple)this).getBarras() + " y el amortiguador " + this.amortiguador);
    }
}
