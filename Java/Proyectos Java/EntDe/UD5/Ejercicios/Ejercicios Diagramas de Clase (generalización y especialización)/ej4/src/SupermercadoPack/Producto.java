package SupermercadoPack;

/**
 * <h1>Producto.java</h1><hr>
 * <p>Esta clase represanta producto</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Producto {

   private float precio;

    public Producto(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.precio + "";
    }
}
