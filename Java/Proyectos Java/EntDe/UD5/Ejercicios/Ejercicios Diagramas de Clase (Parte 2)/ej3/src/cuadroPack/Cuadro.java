package cuadroPack;

/**
 * <h1>Cuadro.java</h1><hr>
 * <p>Esta clase represanta un cuadro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Cuadro {

//    Atrib
    private String propietario;
    private float precio;
    private boolean alaVenta;

    private Marco marco;
    private Cristal cristal;
    private Lamina lamina;

//Constructor
    public Cuadro(String propietario, float precio, Marco marco, Cristal cristal, Lamina lamina) {
        this.propietario = propietario;
        this.precio = precio;
        this.alaVenta = false;
        this.marco = marco;
        this.cristal = cristal;
        this.lamina = lamina;
    }

//    Gets y Sets
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public boolean isAlaVenta() {
        return alaVenta;
    }
    public void setAlaVenta(boolean alaVenta) {
        this.alaVenta = alaVenta;
    }
    public Marco getMarco() {
        return marco;
    }
    public void setMarco(Marco marco) {
        this.marco = marco;
    }
    public Cristal getCristal() {
        return cristal;
    }
    public void setCristal(Cristal cristal) {
        this.cristal = cristal;
    }
    public Lamina getLamina() {
        return lamina;
    }
    public void setLamina(Lamina lamina) {
        this.lamina = lamina;
    }

//    toString
    @Override
    public String toString() {
        return "Cuadro{" +
                "propietario='" + this.propietario + '\'' +
                ", precio=" + this.precio +
                ", alaVenta=" + this.alaVenta +
                ", marco=" + this.marco +
                ", cristal=" + this.cristal +
                ", lamina=" + this.lamina +
                '}';
    }

//    Metodos
    public boolean vender(String propietario) {
        boolean vendido = false;

        if (this.alaVenta){
            this.propietario = propietario;
            this.alaVenta = false;
            vendido = true;
        }

        return vendido;
    }

    public void cambiarEstado(){
        /*if (this.alaVenta)
            this.alaVenta = false;
        else
            this.alaVenta = true;
            Es igual a:*/
        this.alaVenta = !this.alaVenta;
    }

}
