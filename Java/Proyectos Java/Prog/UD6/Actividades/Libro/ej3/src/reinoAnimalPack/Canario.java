package reinoAnimalPack;

/**
 * <h1>Canario.java</h1><hr>
 * <p>Esta clase represanta un canario</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Canario extends Ave{

    private String color;

    public Canario(String nombre, String orden, String color) {
        super(nombre, orden);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    Mis metodos

    public void piar(){
        System.out.println("Pio pio pio pio");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("Granos");
    }

    public void escapar(){
        System.out.println("Por fin libre");
    }
}
