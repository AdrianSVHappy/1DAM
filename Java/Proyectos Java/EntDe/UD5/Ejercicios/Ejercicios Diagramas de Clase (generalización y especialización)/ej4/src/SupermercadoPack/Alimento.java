package SupermercadoPack;

/**
 * <h1>Alimento.java</h1><hr>
 * <p>Esta clase represanta un alimento</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Alimento extends Producto{

    private String nombre;
    private String fechaCaducidad;

    public Alimento(float precio, String nombre, String fechaCaducidad) {
        super(precio);
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return this.nombre + "\t|\t" + this.fechaCaducidad + "\t|\t" + super.toString();
    }
}
