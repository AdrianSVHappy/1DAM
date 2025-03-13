package Clases_Hotel;

/**
 * Esta clase para el control y verificación de la disponibilidad de la habitación.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class ExcepcionHabitacionOcupada extends Exception{
    public ExcepcionHabitacionOcupada(){
        System.out.println("ExcepcionHabitacionOcupada: la habitación está ocupada.");
    }
}
