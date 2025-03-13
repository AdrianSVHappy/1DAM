/**
 * <h1>GestionaCuentas.java</h1><hr>
 * <p>Ejercicio 1: A partir de la case del siguiente diagrama de clase, construir un programa en Java, creando las clases e implementando los métodos necesarios, que muestre un menú permitiendo crear una cuenta bancaria y registrar movimientos tanto de ingreso como de extracción de dinero. (Se recomienda que el método main se incluya en la clase “GestionaCuentas”) </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-abr-2024
 */
public class GestionaCuentas {
    public static void main(String[] args) {

        Cuenta test = new Cuenta("pedro");
        System.out.println(test);
        test.ingresarDinero(55.3f);
        System.out.println(test);
        test.extraerDinero(33.33f);
        System.out.println(test);

    }
}