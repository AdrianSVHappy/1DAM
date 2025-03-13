package SupermercadoPack;

/**
 * <h1>Electrodomestico.java</h1><hr>
 * <p>Esta clase represanta electrodomestico</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Electrodomestico extends NoAlimento{

    private String modelo;

    public Electrodomestico(float precio, String marca, String modelo) {
        super(precio, marca);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return this.modelo + "\t|\t" + super.toString();
    }
}
