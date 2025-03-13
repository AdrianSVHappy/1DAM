package BibliotecaPack;

/**
 * <h1>Documento.java</h1><hr>
 * <p>Esta clase represanta todos los tipos de documentos que puede haber en una biblioteca (libros y revistas)</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Documento {

    private String titulo;
    private String genero;

    public Documento(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.titulo + "\t|\t" + this.genero;
    }
}
