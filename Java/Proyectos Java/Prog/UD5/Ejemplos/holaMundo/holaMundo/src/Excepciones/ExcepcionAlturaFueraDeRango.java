package Excepciones;

/**
 * <h1>ExcepcionAlturaFueraDeRango.java</h1><hr>
 * <p>Esta clase represanta la excepcion de salirse de rango</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-may-2024
 */
public class ExcepcionAlturaFueraDeRango extends Exception {

    /**
     * La altura está fuera del rango permitido.
     */
    public ExcepcionAlturaFueraDeRango() {
        System.out.println("ExcepcionAlturaFueraDeRango: La altura está fuera del rango permitido.");
    }

}
