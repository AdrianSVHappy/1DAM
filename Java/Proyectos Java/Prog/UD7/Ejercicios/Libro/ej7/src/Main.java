import java.util.ArrayList;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * <p>Ejercicio 7 <br>
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.</p>
 *
 * <pre>
 * Ejemplo:
 * 2 céntimos – cara
 * 2 céntimos – cruz
 * 50 céntimos – cruz
 * 1 euro – cruz
 * 1 euro – cara
 * 10 céntimos – cara</pre>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 08-may-2024
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Moneda> lista = new ArrayList<Moneda>();
        String val = "", pos = "";

        for (int i = 0; i < 6; i++) {

            switch (((int) (Math.random() * 8))) {
                case 0:
                    val = "1 céntimo";
                    break;
                case 1:
                    val = "2 céntimos";
                    break;
                case 2:
                    val = "5 céntimos";
                    break;
                case 3:
                    val = "10 céntimos";
                    break;
                case 4:
                    val = "25 céntimos";
                    break;
                case 5:
                    val = "50 céntimos";
                    break;
                case 6:
                    val = "1 euro";
                    break;
                case 7:
                    val = "2 euros";
                    break;
            }

            switch (((int) (Math.random() * 2))) {
                case 0:
                    pos = "cara";
                    break;
                case 1:
                    pos = "cruz";
                    break;
            }

            if (i > 0) {

                if (
                        !val.equals(lista.getLast().getValor())
                                &&
                        !pos.equals(lista.getLast().getPosicion())
                ) {

                    switch (((int) (Math.random() * 2))) {
                        case 0:
                            val = lista.getLast().getValor();
                            break;
                        case 1:
                            pos = lista.getLast().getPosicion();
                            break;
                    }

                }
            }
            lista.add(new Moneda(val, pos));
        }

            for (Moneda moneda : lista) {
                System.out.println(moneda);
            }

    }
}