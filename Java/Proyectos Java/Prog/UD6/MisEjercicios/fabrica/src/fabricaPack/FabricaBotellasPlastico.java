package fabricaPack;

/**
 * <h1>FabricaBotellasPlastico.java</h1><hr>
 * <p>Esta clase represanta una fabrica de botellas de plastico</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 02-may-2024
 */
public class FabricaBotellasPlastico extends FabricaBotellas {

    private boolean toxico;

    public FabricaBotellasPlastico(float volumen, String material, String color) {
        super(volumen, material, color);
        this.toxico = true;
    }

    public boolean isToxico() {
        return toxico;
    }

    public void setToxico(boolean toxico) {
        this.toxico = toxico;
    }

    @Override
    public String toString() {
        return "\t|\t" + this.toxico + super.toString();
    }

    @Override
    public boolean controlCalidad() {
        return !this.toxico;
    }

    public boolean expandido(boolean es){
        boolean res = true;

        if(this.toxico != es)
            this.toxico = es;
        else
            res = false;

        return res;
    }



}
