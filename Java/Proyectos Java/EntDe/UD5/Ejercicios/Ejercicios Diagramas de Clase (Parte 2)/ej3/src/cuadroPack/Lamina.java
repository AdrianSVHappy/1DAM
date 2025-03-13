package cuadroPack;

/**
 * <h1>Lamina.java</h1><hr>
 * <p>Esta clase represanta la lamina de un cuadro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Lamina {

    private String id;
    private String autor;
    private String tipoPintura;

    private static int cont = 0;

//    Constructor
    public Lamina(String autor, String tipoPintura) {
        this.id = Integer.toString(cont);
        this.autor = autor;
        this.tipoPintura = tipoPintura;
        cont++;
    }

//    Gets y Sets
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTipoPintura() {
        return tipoPintura;
    }
    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

//    toString

    @Override
    public String toString() {
        return "Lamina{" +
                "id='" + this.id + '\'' +
                ", autor='" + this.autor + '\'' +
                ", tipoPintura='" + this.tipoPintura + '\'' +
                '}';
    }
}

