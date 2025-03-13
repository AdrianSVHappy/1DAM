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
        String ret = "";

        for (Elemento elemento : this.elementos) {
            ret += elemento.toString() + "\n";
        }

        return ret;
    }

    public void agrega(Elemento ele){
        int cont = 0;
        boolean existe = false;

        for (Elemento elemento : this.elementos) {

            if(elemento.getNombre().equals(ele.getNombre())){
                existe = true;
                break;
            }
            cont ++;
        }

        if(!existe)
            this.elementos.add(ele);
        else
            this.elementos.set(cont, new Elemento(ele.getNombre(), ele.getPrecio(), ele.getCantidad() + this.elementos.get(cont).getCantidad()));
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
