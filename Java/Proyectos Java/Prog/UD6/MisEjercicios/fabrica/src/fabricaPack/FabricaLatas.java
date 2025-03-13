package fabricaPack;

/**
 * <h1>FabricaLatas.java</h1><hr>
 * <p>Esta clase represanta una fabrica de latas</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 02-may-2024
 */
public class FabricaLatas extends FabricaEnvases {

    private String forma;
    private float altura;
    private boolean vacio;

    public FabricaLatas(float volumen, String material, String forma, float altura) {
        super(volumen, material);
        this.forma = forma;
        this.altura = altura;
        this.vacio = false;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    @Override
    public String toString() {
        return "\t|\t" + this.forma + "\t|\t" + this.altura + "\t|\t" + this.altura + super.toString();
    }

    public boolean alVacio() {

        this.vacio = !this.vacio;

        return this.vacio;
    }

    @Override
    public boolean controlCalidad() {
        return this.vacio;
    }
}