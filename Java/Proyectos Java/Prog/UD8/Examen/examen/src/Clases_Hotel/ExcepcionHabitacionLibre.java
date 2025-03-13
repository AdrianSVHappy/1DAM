package Clases_Hotel;

/**
 * Esta clase para el control y verificación de la disponibilidad de la habitación.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class ExcepcionHabitacionLibre extends Exception{
    public ExcepcionHabitacionLibre(){
        System.out.println("ExcepcionHabitacionLibre: la habitación está libre. ");
    }
}
