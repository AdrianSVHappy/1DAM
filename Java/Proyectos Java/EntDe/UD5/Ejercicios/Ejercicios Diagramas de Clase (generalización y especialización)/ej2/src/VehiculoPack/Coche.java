package VehiculoPack;

/**
 * <h1>Coche.java</h1><hr>
 * <p>Esta clase represanta un coche</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Coche extends Vehiculo {

    private int numPuerta;

    public Coche(String marca, String modelo, int numPuerta) {
        super(marca, modelo);
        this.numPuerta = numPuerta;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.numPuerta;
    }
}
