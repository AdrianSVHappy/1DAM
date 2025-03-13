package Clases_Hotel;

/**
 * <h1>ExcepcionHabitacionOcupada.java</h1><hr>
 * <p>Esta clase represanta una excepción, cuando se asigna a un cliente una
 * habitación ya ocupada.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class ExcepcionHabitacionOcupada extends Exception{

    public ExcepcionHabitacionOcupada(){
        System.out.println("ExcepcionHabitacionOcupada: cuando se asigna a un cliente una habitación ya ocupada.");
    }
}
