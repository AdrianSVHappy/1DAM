package vehiculopack;

/**
 * <h1>Bicicleta.java</h1><hr>
 * <p>Esta clase represanta una bicicleta y hereda de la clase vehiculo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */
public class Bicicleta extends Vehiculo{

    //    Atrib
    private boolean deCarreras;

    //    Constructor
    public Bicicleta(boolean deCarreras) {
        super();
        this.deCarreras = deCarreras;
    }

//    Gets y sets

    public boolean isDeCarreras() {
        return deCarreras;
    }

    public void setDeCarreras(boolean deCarreras) {
        this.deCarreras = deCarreras;
    }




    //    Otros metodos
    public void cambiarTipo(){
        this.deCarreras = !this.deCarreras;
    }
}
