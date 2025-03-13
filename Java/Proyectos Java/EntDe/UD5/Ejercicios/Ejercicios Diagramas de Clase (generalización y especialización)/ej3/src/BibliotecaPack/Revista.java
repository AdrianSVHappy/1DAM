package BibliotecaPack;

/**
 * <h1>Revista.java</h1><hr>
 * <p>Esta clase represanta una revista</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Revista extends Documento{

    private int numeroEdicion;
    private String fechaPublicacion;

    public Revista(String titulo, String genero, int numeroEdicion, String fechaPublicacion) {
        super(titulo, genero);
        this.numeroEdicion = numeroEdicion;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.numeroEdicion + "\t|\t" + this.fechaPublicacion;
    }
}
