import java.util.ArrayList;

/**
 * <h1>Carrito.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 14-may-2024
 */
public class Carrito {

    private ArrayList<Elemento> elementos;

    public Carrito() {
        elementos = new ArrayList<Elemento>();
    }

    @Override
    public String toString() {
        String ret = "Contenido del carrito\n" +
                "=====================\n";

        for (Elemento elemento : this.elementos) {
            ret += elemento.toString() + "\n";
        }

        return ret;
    }

    public void agrega(Elemento ele){
        this.elementos.add(ele);
    }

    public int numeroDeElementos() {
        return this.elementos.size();
    }

    public float importeTotal(){

        float total = 0;

        for (Elemento elemento : this.elementos) {

            total += elemento.getPrecio() * elemento.getCantidad();

        }

        return total;
    }


}
