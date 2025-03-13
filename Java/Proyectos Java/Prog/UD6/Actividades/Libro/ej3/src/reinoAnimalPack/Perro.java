package reinoAnimalPack;

/**
 * <h1>Perro.java</h1><hr>
 * <p>Esta clase represanta un perro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Perro extends Mamifero{

    private String raza;

    public Perro(String nombre, String orden, String raza) {
        super(nombre, orden);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

//    Mis metodos

    public void ladrar(){
        System.out.println("Guau Guau Guau Guau Guau Guau Guau");
    }

    public void auyar(){
        System.out.println("Auuuuuuuuuuuuuuuuuu");
    }

    public void grunyir(){
        System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrr");
    }
}
