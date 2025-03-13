package SupermercadoPack;

/**
 * <h1>NoAlimento.java</h1><hr>
 * <p>Esta clase represanta no alimento</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class NoAlimento extends Producto{

    private String marca;

    public NoAlimento(float precio, String marca) {
        super(precio);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return this.marca + "\t|\t" + super.toString();
    }
}
