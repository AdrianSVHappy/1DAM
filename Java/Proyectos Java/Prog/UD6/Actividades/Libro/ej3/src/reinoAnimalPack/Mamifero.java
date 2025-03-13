package reinoAnimalPack;

/**
 * <h1>Mamifero.java</h1><hr>
 * <p>Esta clase represanta un mamifero</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Mamifero extends Animal {

    private String orden;

    public Mamifero(String nombre, String orden) {
        super(nombre);
        this.orden = orden;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

//    Mis metodos
    public void correr (){
        System.out.println("Mira como corro");
    }

    public void ibernar (){
        for (int i = 0; i < 5; i++) {
            super.dormir();
        }
    }

    public void trepar (){
        System.out.println("Mira como trepo");
    }

}
