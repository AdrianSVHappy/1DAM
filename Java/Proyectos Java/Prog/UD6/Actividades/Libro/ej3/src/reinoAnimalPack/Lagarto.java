package reinoAnimalPack;

/**
 * <h1>Lagarto.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Lagarto extends Animal{

    private String orden;

    public Lagarto(String nombre, String orden) {
        super(nombre);
        this.orden = orden;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

//    otros metodos

    public void cambiarPiel(){
        System.out.println("Estoy creciendo mucho");
    }

    public void tomarSol(){
        System.out.println("Hora de calentarse un poco");
    }

    public void ponerHuevos(){
        System.out.println("Mira el tamaño de estos huevos");
    }

}


