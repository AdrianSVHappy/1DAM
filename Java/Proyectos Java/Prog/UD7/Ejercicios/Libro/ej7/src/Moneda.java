/**
 * <h1>Moneda.java</h1><hr>
 * <p>Esta clase represanta una moneda</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 08-may-2024
 */
public class Moneda {

    private String valor;
    private String posicion;

    public Moneda(String valor, String posicion) {
        this.valor = valor;
        this.posicion = posicion;
    }

    public String getValor() {
        return valor;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return this.valor + " - " + this.posicion;
    }
}
