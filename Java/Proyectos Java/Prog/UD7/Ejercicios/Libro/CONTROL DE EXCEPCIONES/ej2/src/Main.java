/**
 * <h1>Ejercicio 2</h1><hr>
 * <p>Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-may-2024
 */
public class Main {
    public static void main(String[] args) {
        Gato garfield = new Gato("macho");
        Gato tom = new Gato("macho");
        try {
            garfield.apareaCon(tom);
        } catch (ExcepcionApareamientoImposible eai) {
            eai.printStackTrace();
            System.out.println("Dos gatos del mismo sexo no se pueden aparear.");
        }


    }
}