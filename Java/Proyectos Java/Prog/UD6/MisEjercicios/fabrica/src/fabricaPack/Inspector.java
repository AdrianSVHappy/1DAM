package fabricaPack;

/**
 * <h1>Inspector.java</h1><hr>
 * <p>Esta interface recoge metodos para establecer un volumen y el material del envase</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 03-may-2024
 */
public interface Inspector {

    float cantidadMaterial(float volumen);
    String decidirTipoMaterial(String producto);

}
