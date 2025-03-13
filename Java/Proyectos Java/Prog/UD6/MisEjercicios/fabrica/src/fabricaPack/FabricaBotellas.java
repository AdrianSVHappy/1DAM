package fabricaPack;

/**
 * <h1>FabricaBotellas.java</h1><hr>
 * <p>Esta clase represanta una fabrica de botellas</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 02-may-2024
 */
public abstract class FabricaBotellas extends FabricaEnvases{

    private String tapon;
    private String color;

    public FabricaBotellas(float volumen, String material, String color) {
        super(volumen, material);
        this.tapon = "Sin tapon";
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTapon() {
        return tapon;
    }

    public void setTapon(String tapon) {
        this.tapon = tapon;
    }

    @Override
    public String toString() {
        return "\t|\t" + this.tapon + "\t|\t" + this.color + super.toString();
    }

    public boolean ponerTapon(String tapon){
        boolean res = true;

        if((tapon.equals("")) || (!this.tapon.equals("")))
            res = false;

        return res;
    }
}


