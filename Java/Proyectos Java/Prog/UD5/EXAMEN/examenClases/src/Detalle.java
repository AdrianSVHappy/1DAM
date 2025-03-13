/**
 * <h1>Detalle.java</h1><hr>
 * <p>Esta clase represanta los detalles de un articulo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Detalle {

    //Articulo al que detalla
    private Articulo articulo;
    //Cantidad a comprar de ese articulo
    private int cantidad;
    private float precioSin;
    private float precioCon;


    /**
     * Constructor de Detalle
     * @param articulo El articulo que detalla
     * @param cantidad La cantidad de el articulo que vamos a comprar
     */
    public Detalle(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precioSin = this.articulo.getPrecio()*this.cantidad;
        this.precioCon = this.precioSin*(1+this.articulo.getIva()); //CLAVE
    }

    /**
     * Almacena en un String la información relevante del detalle
     * @return El String en el que se almacena
     */
    @Override
    public String toString() {
        return this.precioSin + "€" + this.precioCon + "€" ;
    }

    public float getPrecioSin() {
        return precioSin;
    }

    public float getPrecioCon() {
        return precioCon;
    }
}
