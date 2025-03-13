/**
 * <h1>Elemento.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 14-may-2024
 */
public class Elemento {

    private String nombre;
    private float precio;
    private int cantidad;

    public Elemento(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }


    @Override
    public String toString() {
        return this.nombre + " PVP: " + this.precio + " Unidades: " + this.cantidad + " Subtotal: " + this.precio * this.cantidad;
    }
}
