package bibliotacaPack;

/**
 * <h1>Revista.java</h1><hr>
 * <p>Esta clase represanta una revista, hereda de Publicacion</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 23-abr-2024
 */
public class Revista extends Publicacion{

    private int num;

    public Revista(String isbn, String titulo, int anyo, int num) {
        super(isbn, titulo, anyo);
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.num;
    }
}
