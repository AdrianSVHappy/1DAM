package reinoAnimalPack;

/**
 * <h1>Pinguino.java</h1><hr>
 * <p>Esta clase represanta un pinguino</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Pinguino extends Ave{

    private String raza;

    public Pinguino(String nombre, String orden, String raza) {
        super(nombre, orden);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void volar() {
        System.out.println("Pero si yo no vuelo");
    }

    public void nadar(){
        System.out.println("fush fush fush fush fush fush fush fush");
    }

    public void graznar(){
        System.out.println("Paaagh paaaagh paaagh");
    }
}
