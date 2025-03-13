import vehiculopack.*;

import java.util.Scanner;

/**
 * <h1>Main.java</h1><hr>
 * <p>Esta clase represanta el main del programa</p>
 * <p>Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:</p>
 *
 * <pre>VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):</pre>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int menu;
        Bicicleta bici = new Bicicleta(false);
        Coche coche = new Coche(15);


        do {
            System.out.println("VEHÍCULOS\n" +
                    "  =========\n" +
                    "  1. Anda con la bicicleta\n" +
                    "  2. Cambiar tipo bicicleta\n" +
                    "  3. Anda con el coche\n" +
                    "  4. Llenar tanque del coche\n" +
                    "  5. Ver kilometraje de la bicicleta\n" +
                    "  6. Ver kilometraje del coche\n" +
                    "  7. Ver kilometraje total\n" +
                    "  8. Salir\n" +
                    "  Elige una opción (1-8):");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n Anda con la bicicleta\n");
                    bici.conducir();
                    System.out.println(bici.getKilometrosRecorridos());
                    break;
                case 2:
                    System.out.println("\n Cambiar tipo bicicleta\n");
                    bici.cambiarTipo();
                    System.out.println(bici.isDeCarreras());
                case 3:
                    System.out.println("\n Anda con el coche\n");
                    coche.conducir();
                    System.out.println(coche.getTanque() + " - " + coche.getKilometrosRecorridos());
                    break;
                case 4:
                    System.out.println("\n Llenar tanque del coche\n");
                    coche.repostar(5);
                    System.out.println(coche.getTanque());
                    break;
                case 5:
                    System.out.println("\n Ver kilometraje de la bicicleta\n");
                    System.out.println(bici.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("\n Ver kilometraje de la coche\n");
                    System.out.println(coche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("\n Ver kilometraje total\n");
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    System.out.println("\n Salir\n");
                    break;
                default:

            }

        }while (menu != 8);




    }
}