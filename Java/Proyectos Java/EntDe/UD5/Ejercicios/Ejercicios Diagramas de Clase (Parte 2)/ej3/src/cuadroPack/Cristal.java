package cuadroPack;

/**
 * <h1>Cristal.java</h1><hr>
 * <p>Esta clase represanta el cristal de un cuadro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Cristal {
//    Atrib
    private String color;
    private int grosor;

//    Constructor
    public Cristal(String color, int grosor) {
        this.color = color;
        this.grosor = grosor;
    }

//    Gets y Sets
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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
        return "Cristal{" +
                "color='" + this.color + '\'' +
                ", grosor=" + this.grosor +
                '}';
    }
}
