package Bicicletas;

/**
 * <h1>Simple_E.java</h1><hr>
 * <p>Esta clase represanta una biciclete simple electrica</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public class Simple_E extends Simple implements Electricos{

    private String motor;
    private String numSerie;

    public Simple_E(String juegoPiezas, String barras, String motor) {
        super(juegoPiezas, barras);
        this.motor = motor;
        this.numSerie = ((Bicicleta)this).numSerie + "E1";
    }

    @Override
    public String getNumSerie() {
        return numSerie;
    }

    @Override
    public void montarMotor() {
        System.out.println("Ya he montado el motor " + this.motor + " en la bicileta simple.");
    }

    @Override
    public void probarMotor() {
        System.out.println("Ya he probado el motor " + this.motor + " en la bicileta simple.");
    }
}
