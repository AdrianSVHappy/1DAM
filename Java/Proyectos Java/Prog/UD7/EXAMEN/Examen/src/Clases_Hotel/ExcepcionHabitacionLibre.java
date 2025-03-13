package Clases_Hotel;

/**
 * <h1>ExcepcionHabitacionLibre.java</h1><hr>
 * <p>Esta clase represanta una excepción, si queremos dejar libre una habitación
 * que ya está libre.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class ExcepcionHabitacionLibre extends Exception {

    public ExcepcionHabitacionLibre() {
        System.out.println("ExcepcionHabitacionLibre: Si queremos dejar libre una habitación que ya está libre.");
    }
}
