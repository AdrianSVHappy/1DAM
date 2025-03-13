/**
 * <h1>Articulo.java</h1><hr>
 * <p>Esta clase represanta un articulo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Articulo {

    //ID del articulo
    private int identificador;
    //Breve descripción del articulo
    private String descripcion;
    //Precio del articulo
    private float precio;
    //IVA del articulo
    private float iva;

    /**
     * Constructor de Articulo
     * @param identificador ID del articulo
     * @param descripcion Descripción del articulo
     * @param precio Precio del articulo
     * @param iva IVA del articulo
     */
    public Articulo(int identificador, String descripcion, float precio, float iva) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.precio = precio;
        this.iva = iva;
    }

    public float getIva() {
        return iva;
    }

    public float getPrecio() {
        return precio;
    }

    /**
     * Almacena en un String la información relevante del articulo
     * @return El String en el que se almacena
     */
    @Override
    public String toString() {
        return this.identificador + "\t" + this.descripcion + "\t" + this.precio + "€";
    }
}
