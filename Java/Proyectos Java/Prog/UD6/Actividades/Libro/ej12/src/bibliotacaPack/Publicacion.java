package bibliotacaPack;

/**
 * <h1>Publicacion.java</h1><hr>
 * <p>Esta clase represanta una publicación</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 23-abr-2024
 */
public class Publicacion {

    private String isbn;
    private String titulo;
    private int anyo;

    public Publicacion(String isbn, String titulo, int anyo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return this.isbn + "\t|\t" + this.titulo + "\t|\t" + this.anyo;
    }
}
