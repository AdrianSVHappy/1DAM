package BibliotecaPack;

/**
 * <h1>Libro.java</h1><hr>
 * <p>Esta clase represanta un libro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Libro extends Documento{

    private String autor;
    private int anyoPublicacion;

    public Libro(String titulo, String genero, String autor, int anyoPublicacion) {
        super(titulo, genero);
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.autor + "\t|\t" + this.anyoPublicacion;
    }
}
