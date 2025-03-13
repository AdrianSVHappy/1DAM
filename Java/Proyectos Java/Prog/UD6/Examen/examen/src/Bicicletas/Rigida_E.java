package Bicicletas;

import java.nio.Buffer;

/**
 * <h1>Rigida_E.java</h1><hr>
 * <p>Esta clase represanta una bicicleta rigida electrica</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public class Rigida_E extends Rigida implements Electricos{

    private String motor;
    private String numSerie;

    public Rigida_E(String juegoPiezas, String horquilla, String motor) {
        super(juegoPiezas, horquilla);
        this.motor = motor;
        this.numSerie = ((Bicicleta)this).numSerie + "E";
    }

    @Override
    public String getNumSerie() {
        return numSerie;
    }

    @Override
    public void montarMotor() {
        System.out.println("Ya he montado el motor " + this.motor + " en la bicileta rigida.");
    }

    @Override
    public void probarMotor() {
        System.out.println("Ya he probar el motor " + this.motor + " en la bicileta rigida.");
    }
}
