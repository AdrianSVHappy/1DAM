package bibliotacaPack;

/**
 * <h1>Prestable.java</h1><hr>
 * <p>Esta interface represanta un conjunto de metodos en relación con el prestamo de libros</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 23-abr-2024
 */
public interface Prestable {
    void presta();
    boolean estaPrestado();
    void devuelve();
}
