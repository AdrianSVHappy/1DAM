package reinoAnimalPack;

/**
 * <h1>Ave.java</h1><hr>
 * <p>Esta clase represanta una ave</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Ave extends Animal {

    private String orden;

    public Ave(String nombre, String orden) {
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

    public void volar(){
        System.out.println("Mira como vuelo");
    }

    public void ponerHuevo(){
        System.out.println("PLOP! Eh? Pero si soy macho!");
    }

    public void incubar(){
        System.out.println("Asi así calentio");
    }
}
