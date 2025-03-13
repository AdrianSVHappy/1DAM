package Bicicletas;

/**
 * <h1>Simple.java</h1><hr>
 * <p>Esta clase represanta una bicicleta simple</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public class Simple extends Bicicleta{

    private String barras;
    private String numSerie;

    public Simple(String juegoPiezas, String barras) {
        super(juegoPiezas);
        this.barras = barras;
        this.numSerie = ((Bicicleta)this).numSerie + "S";
    }

    public String getBarras() {
        return barras;
    }

    @Override
    public String getNumSerie() {
        return numSerie;
    }


    /**
     * Se muestra por pantalla que se ha montado la barra
     */
    public void montarBarras(){
        System.out.println("Ya he montado las barras " + this.barras + " en la bici");
    }

    /**
     * Se muestra por pantalla que se ha probado la barra
     */
    public void probarBarras(){
        System.out.println("Ya he probado las barras " + this.barras + " y funcionan bien");
    }

    @Override
    public void montarBici() {
        System.out.println("Ya he montado la bici de tipo \"Bicicletas.Simples\", incluyendo la horquilla " + this.barras);
    }
}
