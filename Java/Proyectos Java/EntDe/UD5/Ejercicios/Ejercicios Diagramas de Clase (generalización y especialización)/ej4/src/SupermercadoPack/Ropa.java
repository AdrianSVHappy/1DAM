package SupermercadoPack;

/**
 * <h1>Ropa.java</h1><hr>
 * <p>Esta clase represanta ropa</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Ropa extends NoAlimento{

    private int tamanyo;

    public Ropa(float precio, String marca, int tamanyo) {
        super(precio, marca);
        this.tamanyo = tamanyo;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.tamanyo;
    }
}
