/**
 * <h1>Piramide.java</h1><hr>
 * <p>Esta clase representa a una piramide</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class Piramide {

//    Atrib
    private int altura;

    private static int piramidesCreadas;

//    Constructor
    public Piramide(int altura) {
        this.altura = altura;
        Piramide.piramidesCreadas++;
    }


//    Gets y Sets
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
    public static void setPiramidesCreadas(int piramidesCreadas) {
        Piramide.piramidesCreadas = piramidesCreadas;
    }

//    toString

    /**
     * @return Representación grafica de la piramide
     */
    @Override
    public String toString() {
        String figura = "";
        int aux;

        for (int i = 0; i < this.altura; i++) {
            aux = 0;
            while(aux < this.altura-i-1){
                figura += " ";
                aux ++;
            }
            aux = 0;
            while (aux < (1 + (2 * i))){
                figura += "*";
                aux++;
            }
            figura += "\n";
        }

        return figura;
    }
}
