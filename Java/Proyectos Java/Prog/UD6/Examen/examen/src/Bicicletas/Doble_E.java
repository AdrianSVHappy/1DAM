package Bicicletas;

/**
 * <h1>Doble_E.java</h1><hr>
 * <p>Esta clase represanta una bicicleta doble electrica</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public class Doble_E extends Doble implements Electricos{

    private String motor;
    private String numSerie;

    public Doble_E(String juegoPiezas, String barras, String amortiguador, String motor) {
        super(juegoPiezas, barras, amortiguador);
        this.motor = motor;
        this.numSerie = ((Bicicleta)this).numSerie + "E2";
    }

    @Override
    public String getNumSerie() {
        return numSerie;
    }

    @Override
    public void montarMotor() {
        System.out.println("Ya he montado el motor " + this.motor + " en la bicileta Doble.");
    }

    @Override
    public void probarMotor() {
        System.out.println("Ya he probado el motor " + this.motor + " en la bicileta Doble.");
    }
}


