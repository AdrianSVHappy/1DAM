package Bicicletas;

/**
 * <h1>Rigida.java</h1><hr>
 * <p>Esta clase represanta una bicicleta rigidad</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public class Rigida extends Bicicleta{

    private String horquilla;
    private String numSerie;

    public Rigida(String juegoPiezas, String horquilla) {
        super(juegoPiezas);
        this.horquilla = horquilla;
        this.numSerie = super.getNumSerie() + "R";
    }

    @Override
    public String getNumSerie() {
        return numSerie;
    }


    @Override
    public void montarBici() {
        System.out.println("Ya he montado la bici de tipo \"Rigida\", incluyendo la horquilla " + this.horquilla);
    }


}
