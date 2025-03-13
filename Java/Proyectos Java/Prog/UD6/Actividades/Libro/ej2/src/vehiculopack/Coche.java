package vehiculopack;

/**
 * <h1>Coche.java</h1><hr>
 * <p>Esta clase represanta un coche y hereda de la clase Vehiculo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Coche extends Vehiculo {
//    Atrib

    private int tanque;

//    Constructor
    public Coche(int tanque) {
        super();
        this.tanque = tanque;
    }

//    Gets y Sets
    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    //    Otros metodos
    public void repostar(int litro){
        this.tanque += litro;
    }

    @Override
    public void conducir() {
        super.conducir();
        this.tanque -= 1;
    }
}
