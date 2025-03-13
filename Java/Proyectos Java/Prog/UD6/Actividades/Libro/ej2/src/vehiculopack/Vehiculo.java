package vehiculopack;

/**
 * <h1>Vehiculo.java</h1><hr>
 * <p>Esta clase represanta un vehiculo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Vehiculo {

//    Atrib C
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

//    Atrib
    private int kilometrosRecorridos;

//    Constructor
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
        Vehiculo.vehiculosCreados++;
    }

//    Gets y Sets

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    //    Otros metodos
    public void conducir(){
        this.kilometrosRecorridos++;
        kilometrosTotales++;
    }
}
