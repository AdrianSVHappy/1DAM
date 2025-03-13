package Facturas;

/**
 * Esta clase almacena los datos necesarios que debe contener un artículo
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.03
 */
public class Articulo {
    private String ref; //Identificador del artículo.
    private String descripcion;//Descrupción del artículo.
    private float precio;//Precio del artículo.
    private float iva;//IVA aplicable al artículo.

    /**
     * Constructor de la clase. En el se instancia el objeto de la clase "Articulo".
     *
     * @param ref referencia del artículo. String.
     * @param descripcion es la descripción del artículo. String.
     * @param precio es el precio del artículo. Float.
     * @param iva IVA  aplicable al artículo. Se define en formato decimal. Ejemplo para IVA de 21%: 0,21. Float.
     *
     */
    public Articulo(String ref, String descripcion, float precio, float iva) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.precio = precio;
        this.iva = iva;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

}
