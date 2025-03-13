package reinoAnimalPack;

/**
 * <h1>Animal.java</h1><hr>
 * <p>Esta clase represanta a un animal</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Animal {

//    Atrib
    private String nombre;

//    Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

//    gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    Otros metodos

    public void respirar() {
        System.out.println("Respirando");
    }

    public void comer() {
        System.out.println("Comiendo");
    }

    public void dormir() {
        System.out.println("Dormir");
    }
}
