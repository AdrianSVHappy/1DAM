package VehiculoPack;

/**
 * <h1>Moto.java</h1><hr>
 * <p>Esta clase represanta una moto</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Moto extends Vehiculo {

    private String tipo;

    public Moto(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + tipo;
    }
}
