package VehiculoPack;

/**
 * <h1>Vehiculo.java</h1><hr>
 * <p>Esta clase represanta un vehiculo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return this.marca + "\t|\t" + this.modelo;
    }
}
