/**
 * <h1>Articulo.class</h1><hr>
 * <p>Esta clase represanta un articulo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 09-abr-2024
 */
public class Articulo {

//    Atrib
     private static int contador = 0;

     private int codigo;
     private String descripcion;
     private float precioCompra;
     private float precioVenta;
     private int stock;

//     Constructor
    public Articulo(String descripcion, float precioCompra, float precioVenta) {
        this.codigo = contador;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        contador++;
    }

//    Gets y Sets

    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Articulo.contador = contador;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }
    public float getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }


//    toString

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                '}';
    }

//    Mis metodos

    /**
     * Aumenta el stock de un articulo
     * @param cant El número de articulos que ha entrado
     */
    public void entrada(int cant){
        this.stock += cant;
    }

    /**
     * Disminuye el stock de un articulo
     * @param cant El número de articulos que ha salido
     * @return (boolean) true -> Cantidad introducida valida / False -> cantidad introducida no valida
     */
    public boolean salida(int cant){

        boolean bien = false;

        if (cant <= this.stock) {
            this.stock -= cant;
            bien = true;
        }else
            System.out.println("El stock no puede ser negativo");

        return bien;
    }

    /**
     * Modifica un articulo
     * @param descripcion Nueva descripción
     * @param precioCompra Nuevo precio de compra
     * @param precioVenta Nuevo precio de venta
     */
    public void modificar(String descripcion, float precioCompra, float precioVenta){

        if (!descripcion.equals("-1"))
            this.descripcion = descripcion;
        if (precioCompra != -1)
            this.precioCompra = precioCompra;
        if (precioVenta != -1)
            this.precioVenta = precioVenta;
    }


}
