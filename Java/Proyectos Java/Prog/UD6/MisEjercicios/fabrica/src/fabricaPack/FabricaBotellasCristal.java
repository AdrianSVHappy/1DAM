package fabricaPack;

/**
 * <h1>FabricaBotellasCristal.java</h1><hr>
 * <p>Esta clase represanta una fabrica de botellas de cristal</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 02-may-2024
 */
public class FabricaBotellasCristal extends FabricaBotellas {

    private boolean resistente;

    public FabricaBotellasCristal(float volumen, String material, String color) {
        super(volumen, material, color);
        this.resistente = false;
    }

    public boolean isResistente() {
        return resistente;
    }

    public void setResistente(boolean resistente) {
        this.resistente = resistente;
    }


    @Override
    public String toString() {
        return "\t|\t" + this.resistente + super.toString();
    }

    @Override
    public boolean controlCalidad() {
        return this.resistente;
    }

    public boolean soplado(boolean templar){

        boolean res = true;

        if(this.resistente != templar)
            this.resistente = templar;
        else
            res = false;

        return res;
    }






}
