package juego;

/**
 * <h1>Ficha.java</h1><hr>
 * <p>Esta clase represanta una ficha</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Ficha {

//    Atrib
    private Color color;
    private int posicion;

//    Constructor
    public Ficha(Color color) {
        this.color = color;
        this.posicion = 0;
    }

    //    Gets y Sets
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    //    toString
    @Override
    public String toString() {
        return "Ficha{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }


//    Mis metodos
    public int tirarDados(){

        return  (int)(Math.random()*6)+1;

    }
}

