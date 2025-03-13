package fabricaPack;

import java.util.StringJoiner;

/**
 * <h1>FabricaEnvases.java</h1><hr>
 * <p>Esta clase abstracta represanta una fabrica envases</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 02-may-2024
 */
public abstract class FabricaEnvases implements Inspector{

    private float volumen;
    private String material;

    public FabricaEnvases(float volumen, String producto) {
        this.volumen = cantidadMaterial(volumen);
        this.material = decidirTipoMaterial(producto);
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\t|\t" + this.volumen + "\t|\t" + this.material + "\t|\t";
    }

    public abstract boolean controlCalidad();

    @Override
    public float cantidadMaterial(float volumen){
        return 3.0f;
    }

    @Override
    public String decidirTipoMaterial(String producto){
        return "Vinilo";
    }
}
