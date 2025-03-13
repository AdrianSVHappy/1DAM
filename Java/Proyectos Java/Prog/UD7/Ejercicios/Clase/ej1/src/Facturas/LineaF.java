package Facturas;

/**
 * Esta clase gestiona la información que debe contener cada línea de detalle de una factura.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.03
 */
public class LineaF {
    private Articulo art;//Objeto de tipo artículo a incluir en la factura.
    private int cantidad;//Númmero de artículos incluidos en la factura.
    private float totalSin;//Total sin impuestos del artículo.
    private float total;//Total con impuestos del artículo.

    /**
     * Constructor de la clase. En el se instancia el objeto "art" de la clase "Articulo", se calcula el valor
     * total de los artículos antes y después de impuestos.
     *
     * @param art artículo objeto de la línea.
     * @param cantidad número de unidades del artículo. Int.
     * @return void.
     *
     */
    public LineaF(Articulo art, int cantidad) {
        this.art = art;
        this.cantidad = cantidad;
        this.totalSin = (float) cantidad * art.getPrecio();
        this.total = this.totalSin + (this.totalSin * art.getIva());
    }

    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public float getTotal(){
        return this.total;
    }

    public float getTotalSin(){
        return this.totalSin;
    }

}
