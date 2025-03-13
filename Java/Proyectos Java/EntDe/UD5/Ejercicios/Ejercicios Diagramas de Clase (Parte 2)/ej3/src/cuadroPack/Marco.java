package cuadroPack;

/**
 * <h1>Marco.java</h1><hr>
 * <p>Esta clase represanta el marco de un cuadro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Marco {

//    Atrib
    private String tipo;
    private int grosor;

//    Constructor

    public Marco(String tipo, int grosor) {
        this.tipo = tipo;
        this.grosor = grosor;
    }

//    Gets y Sets
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getGrosor() {
        return grosor;
    }
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

//    toString
    @Override
    public String toString() {
        return "Marco{" +
                "tipo='" + this.tipo + '\'' +
                ", grosor=" + this.grosor +
                '}';
    }
}
