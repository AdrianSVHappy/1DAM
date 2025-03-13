package reinoAnimalPack;

/**
 * <h1>Gato.java</h1><hr>
 * <p>Esta clase represanta un gato</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Gato extends Mamifero{

    private String color;

    public Gato(String nombre, String orden, String color) {
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

    private void mauyar(){
        System.out.println("Miau miau miau");
    }

    private void rasgar(){
        System.out.println("Rash rash rash");
    }

    private void ronronear(){
        System.out.println("Prrrrr prrrrrrrrrrrrrrrrr");
    }


}
